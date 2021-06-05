package lyuxc.more.plugin.botania.botaniaadditions;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import tk.zeitheron.botanicadds.blocks.tiles.TileGaiaPlate;

import java.awt.*;

public class GaiaPlate implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileGaiaPlate) {
            TileGaiaPlate tile = (TileGaiaPlate) world.getTileEntity(data.getPos());
            assert tile != null;
            int cyan = Color.cyan.getRGB();
            int green = Color.green.getRGB();
            int white = Color.white.getRGB();
            if (tile.getCurrentMana() > 0) {
                probeInfo.progress(tile.getCurrentMana(), tile.getAvailableSpaceForMana() + tile.getCurrentMana(), new ProgressStyle().prefix("\u8FD8\u9700\u9B54\u529B" + ":" + tile.getAvailableSpaceForMana())
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
        return "random.botania.gaiaplate";
    }
}
