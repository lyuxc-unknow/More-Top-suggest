package lyuxc.more.plugin.embers;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import teamroots.embers.tileentity.TileEntityAutoHammer;

import java.awt.*;

public class ember_auto_hummer implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {

        if (world.getTileEntity(data.getPos()) instanceof TileEntityAutoHammer) {
            TileEntityAutoHammer tileEntityAutoHammer = (TileEntityAutoHammer) world.getTileEntity(data.getPos());
            assert tileEntityAutoHammer != null;
            int max = (int) tileEntityAutoHammer.capability.getEmberCapacity();
            int ember = (int) tileEntityAutoHammer.capability.getEmber();
            int orange = Color.ORANGE.getRGB();
            int yellow = Color.yellow.getRGB();
            int white = Color.white.getRGB();
            if (tileEntityAutoHammer.capability.getEmber() > 0) {
                probeInfo.progress(ember, max + 5, new ProgressStyle().prefix("\u7070\u70EC\u80FD\u91CF" + ":" + ember).suffix("/" + max)
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
        return "random.ember.auto.hammer";
    }
}
