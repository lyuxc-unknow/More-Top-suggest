package lyuxc.more.plugin.lordcraft;

import com.cobbs.lordcraft.Blocks.VoidAltar.TileEntities.VoidAltarTE;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.awt.*;

public class void_altar implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof VoidAltarTE) {
            VoidAltarTE voidAltarTE = (VoidAltarTE) world.getTileEntity(data.getPos());
            assert voidAltarTE != null;
            probeInfo.text("\u80FD\u91CF" + ":" + voidAltarTE.energy);
            int p = Color.magenta.getRGB();
            int b = Color.blue.getRGB();
            if (voidAltarTE.procTime > 0) {
                probeInfo.progress(voidAltarTE.procTime, voidAltarTE.maxProcTime, new ProgressStyle().prefix("\u8FDB\u5EA6" + ":" + voidAltarTE.procTime).suffix("/" + voidAltarTE.maxProcTime)
                        .width(110)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(b)
                        .backgroundColor(p)
                        .filledColor(p));
            }
        }
    }
    @Override
    public String getID() {
        return "random.lordcraft.voidaltar";
    }
}