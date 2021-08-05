package lyuxc.more.plugin.projecte;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import moze_intel.projecte.utils.EMCHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ProjectEProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        long value = EMCHelper.getEmcValue(new ItemStack(blockState.getBlock()));
        if(value>0){
            probeInfo.text(TextFormatting.YELLOW +"EMC"+":"+TextFormatting.RESET+value);
        }
    }
    @Override
    public String getID() {
        return "random.projecte.info";
    }
}
