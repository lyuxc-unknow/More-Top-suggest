package lyuxc.more.plugin.botania.botaniaadditions;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import tk.zeitheron.botanicadds.blocks.tiles.TileDreamingPool;

import java.awt.*;

public class DreamingPool implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileDreamingPool) {
            TileDreamingPool tile = (TileDreamingPool) world.getTileEntity(data.getPos());
            assert tile != null;
            int cyan = Color.cyan.getRGB();
            int green = Color.green.getRGB();
            int white = Color.white.getRGB();
            if (tile.getCurrentMana() > 0) {
                probeInfo.progress(tile.getCurrentMana(), 2000000, new ProgressStyle().prefix(I18n.translateToLocal("random.Botania.Mana") + ":" + tile.getCurrentMana()).suffix("/" + 2000000)
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
        return "random.botania.dreamingpool";
    }
}
