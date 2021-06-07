package lyuxc.more.plugin.projecte;

import com.cobbs.omegacraft.Blocks.Machines.DarkFab.DarkFabTE;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import moze_intel.projecte.gameObjs.tiles.RelayMK1Tile;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.awt.*;

public class Relay implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof RelayMK1Tile) {
        RelayMK1Tile tile = (RelayMK1Tile) world.getTileEntity(data.getPos());
        int p = Color.magenta.getRGB();
        int b = Color.blue.getRGB();
        int w = Color.white.getRGB();
        assert tile != null;
        if (tile.getStoredEmc() > 0) {
            probeInfo.progress(tile.getStoredEmc(), tile.getMaximumEmc(), new ProgressStyle().prefix("\u5DF2\u50A8\u5B58EMC" + ":" + tile.getStoredEmc()).suffix("/" + tile.getMaximumEmc())
                    .width(110)
                    .numberFormat(NumberFormat.NONE)
                    .borderColor(b)
                    .backgroundColor(w)
                    .filledColor(p)
                    .alternateFilledColor(p));
            }
        }
    }
    @Override
    public String getID() {
        return "random.projecte.Relay";
    }
}