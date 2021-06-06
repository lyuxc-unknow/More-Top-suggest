package lyuxc.more.plugin.botania;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import vazkii.botania.common.block.tile.TileRuneAltar;

import java.awt.*;

public class runealtar implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileRuneAltar) {
            TileRuneAltar tile = (TileRuneAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            int cyan = Color.cyan.getRGB();
            int green = Color.green.getRGB();
            int white = Color.white.getRGB();
            if (tile.hasValidRecipe()) {
                probeInfo.progress(tile.getCurrentMana(), tile.getTargetMana(), new ProgressStyle().prefix("\u9B54\u529B" + ":" + tile.getCurrentMana()).suffix("/" + tile.getTargetMana())
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
        return "random.botania.runealtar";
    }
}
