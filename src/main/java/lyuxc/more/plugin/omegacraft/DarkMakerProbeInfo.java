package lyuxc.more.plugin.omegacraft;

import com.cobbs.omegacraft.Blocks.Machines.DarkFab.DarkFabTE;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import java.awt.*;

public class DarkMakerProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof DarkFabTE) {
            DarkFabTE te = (DarkFabTE) world.getTileEntity(data.getPos());
            assert te != null;
            int p = Color.magenta.getRGB();
            int b = Color.blue.getRGB();
            if (te.procTimes.get(0) > 0) {
                probeInfo.progress(te.procTimes.get(0), te.maxProcTime, new ProgressStyle().prefix(I18n.translateToLocal("random.OmegaCraft.DarkMaker.TotalTime") + ":" + te.procTimes.get(0)).suffix("/" + te.maxProcTime)
                        .width(100)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(b)
                        .backgroundColor(p)
                        .filledColor(p));
            }
        }
    }
    @Override
    public String getID(){return "random.omegacraft.darkmaker";}
}