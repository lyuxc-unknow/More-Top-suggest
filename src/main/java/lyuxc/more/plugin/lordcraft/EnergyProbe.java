package lyuxc.more.plugin.lordcraft;

import com.cobbs.lordcraft.Utils.EnergySystem.EnergyRegistry;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class EnergyProbe implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        long value = EnergyRegistry.getEnergyValue(blockState.getBlock());
        if(value>0)
            probeInfo.text(TextFormatting.LIGHT_PURPLE +I18n.translateToLocal("random.LordCraft.EnergySystem")+":"+(value/1000));
    }
    @Override
    public String getID() {
        return "random.lordcraft.energyprobe";
    }
}
