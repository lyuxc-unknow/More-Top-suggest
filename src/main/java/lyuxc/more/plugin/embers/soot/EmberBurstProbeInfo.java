package lyuxc.more.plugin.embers.soot;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import soot.tile.TileEntityEmberBurst;

import java.awt.*;

public class EmberBurstProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileEntityEmberBurst) {
            TileEntityEmberBurst tileEntityCharger = (TileEntityEmberBurst) world.getTileEntity(data.getPos());
            assert tileEntityCharger != null;
            final int max = (int) tileEntityCharger.capability.getEmberCapacity();
            final int ember = (int) tileEntityCharger.capability.getEmber();
            int orange = Color.ORANGE.getRGB();
            int yellow = Color.yellow.getRGB();
            int white = Color.white.getRGB();
            if (tileEntityCharger.capability.getEmber() > 0) {
                probeInfo.progress(ember, max+1, new ProgressStyle().prefix(I18n.translateToLocal("random.Embers.embers") + ":" + ember).suffix("/" + max)
                        .width(110)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(yellow)
                        .backgroundColor(white)
                        .filledColor(orange));
            }
        }
    }
    @Override
    public String getID() {
        return "random.soot.EmberBurst";
    }
}