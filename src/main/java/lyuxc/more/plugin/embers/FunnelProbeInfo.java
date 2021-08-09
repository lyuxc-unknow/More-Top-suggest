package lyuxc.more.plugin.embers;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import teamroots.embers.tileentity.TileEntityEmberFunnel;

import java.awt.*;

public class FunnelProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileEntityEmberFunnel) {
            TileEntityEmberFunnel tileEntityEmberFunnel = (TileEntityEmberFunnel) world.getTileEntity(data.getPos());
            assert tileEntityEmberFunnel != null;
            int max = (int) tileEntityEmberFunnel.capability.getEmberCapacity();
            int ember = (int) tileEntityEmberFunnel.capability.getEmber();
            int orange = Color.ORANGE.getRGB();
            int yellow = Color.yellow.getRGB();
            int white = Color.white.getRGB();
            if (tileEntityEmberFunnel.capability.getEmber() > 0) {
                probeInfo.progress(ember, max + 5, new ProgressStyle().prefix(I18n.translateToLocal("random.Embers.embers") + ":" + ember).suffix("/" + max)
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
        return "random.ember.funnel";
    }
}