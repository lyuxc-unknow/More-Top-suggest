package lyuxc.more.plugin.botania;

import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import vazkii.botania.common.block.tile.TileTerraPlate;

import java.awt.*;

public class TerraPlateProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileTerraPlate) {
            TileTerraPlate tile = (TileTerraPlate) world.getTileEntity(data.getPos());
            assert tile != null;
            int cyan = Color.cyan.getRGB();
            int green = Color.green.getRGB();
            int white = Color.white.getRGB();
            if (tile.getCurrentMana() > 0) {
                probeInfo.progress(tile.getCurrentMana(), tile.getAvailableSpaceForMana() + tile.getCurrentMana(), new ProgressStyle().prefix(I18n.translateToLocal("random.Botania.Mana") + ":").suffix("" + tile.getAvailableSpaceForMana())
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
        return "random.botania.terraplate";
    }
}
