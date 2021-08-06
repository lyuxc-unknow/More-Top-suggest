package lyuxc.more.plugin.botania.botaniaadditions;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import tk.zeitheron.botanicadds.blocks.tiles.TileElvenAltar;

import java.awt.*;

public class ElvenAltarProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileElvenAltar) {
            TileElvenAltar tile = (TileElvenAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            int cyan = Color.cyan.getRGB();
            int green = Color.green.getRGB();
            int white = Color.white.getRGB();
            if (tile.hasValidRecipe()) {
                probeInfo.progress(tile.getCurrentMana(), tile.getTargetMana(), new ProgressStyle().prefix(I18n.translateToLocal("random.Botania.Mana") + ":" + tile.getCurrentMana()).suffix("/" + tile.getTargetMana())
                        .width(110)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(green)
                        .backgroundColor(white)
                        .filledColor(cyan)
                        .alternateFilledColor(cyan));
            }
        }
    }
    @Override
    public String getID() {
        return "random.botania.elvenalter";
    }
}
