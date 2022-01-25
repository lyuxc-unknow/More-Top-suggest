package lyuxc.mtc.plugin.botania;

import lyuxc.mtc.MoreTopSuggest;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import vazkii.botania.common.block.tile.TileBrewery;

import java.awt.*;

public class BreweryProbeInfo implements IProbeInfoProvider {
    public void addProbeInfo(ProbeMode probeMode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData probeHitData){
        if(world.getBlockEntity(probeHitData.getPos()) instanceof TileBrewery){
            TileBrewery tile = (TileBrewery) world.getBlockEntity(probeHitData.getPos());
            assert tile != null;
            if(tile.getCurrentMana() > 0)
                probeInfo.progress(tile.getCurrentMana(), tile.getManaCost(),new ProgressStyle()
                        .prefix(new TranslationTextComponent("mtc.mana.name"))
                        .suffix("/"+tile.getManaCost())
                        .color(Color.green.getRGB(),Color.cyan.getRGB(),Color.white.getRGB()));
        }
    }
    public String getID(){
        return MoreTopSuggest.MOD_ID + ":" + this.getClass().getSimpleName();
    }
}
