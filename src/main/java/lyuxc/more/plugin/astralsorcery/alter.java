package lyuxc.more.plugin.astralsorcery;

import hellfirepvp.astralsorcery.common.tile.TileAltar;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.awt.*;

public class alter implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileAltar) {
            TileAltar tile = (TileAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            int black = Color.black.getRGB();
            int white = Color.white.getRGB();
            int gray = Color.lightGray.getRGB();
            probeInfo.progress(tile.getStarlightStored(), tile.getMaxStarlightStorage(), new ProgressStyle().prefix("\u661F\u80FD" + ":" + tile.getStarlightStored()).suffix("/" + tile.getMaxStarlightStorage())
                    .width(100)
                    .numberFormat(NumberFormat.NONE)
                    .borderColor(black)
                    .backgroundColor(white)
                    .filledColor(gray)
                    .alternateFilledColor(gray));
        }
    }

    @Override
    public String getID() {
        return "random.astralsorcery.alter";
    }
}

