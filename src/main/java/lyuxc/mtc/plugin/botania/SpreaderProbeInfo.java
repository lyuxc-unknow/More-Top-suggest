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
import vazkii.botania.common.block.tile.mana.TileSpreader;

import java.awt.*;

public class SpreaderProbeInfo implements IProbeInfoProvider {
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData data){
        if(world.getBlockEntity(data.getPos()) instanceof TileSpreader){
            TileSpreader tile = (TileSpreader) world.getBlockEntity(data.getPos());
            if(tile.getCurrentMana() > 0)
                probeInfo.progress(tile.getCurrentMana(), tile.getMaxMana(),new ProgressStyle()
                        .prefix(new TranslationTextComponent("mtc.mana.name"))
                        .suffix("/"+tile.getMaxMana())
                        .color(Color.green.getRGB(),Color.cyan.getRGB(),Color.white.getRGB()));
        }
    }
    public String getID(){
        return MoreTopSuggest.MOD_ID + ":" + this.getClass().getSimpleName();
    }
}
