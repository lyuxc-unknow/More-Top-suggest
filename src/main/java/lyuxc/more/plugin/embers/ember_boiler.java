package lyuxc.more.plugin.embers;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import teamroots.embers.tileentity.TileEntityBoilerTop;

import java.awt.*;

public class ember_boiler implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileEntityBoilerTop) {
            TileEntityBoilerTop tileEntityBoilerTop = (TileEntityBoilerTop) world.getTileEntity(data.getPos());
            assert tileEntityBoilerTop != null;
            int max = (int) tileEntityBoilerTop.capability.getEmberCapacity();
            int ember = (int) tileEntityBoilerTop.capability.getEmber();
            int orange = Color.ORANGE.getRGB();
            int yellow = Color.yellow.getRGB();
            int white = Color.white.getRGB();
            if (tileEntityBoilerTop.capability.getEmber() > 0) {
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
        return "random.ember.boiler";
    }
}
