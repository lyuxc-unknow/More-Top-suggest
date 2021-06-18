package lyuxc.more.plugin.primaltech;

import com.rwtema.extrautils2.blocks.BlockEnderLilly;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import primal_tech.blocks.BlockStickBundle;

public class StackBundle implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (blockState.getBlock() instanceof BlockStickBundle) {
            int stage = blockState.getValue(BlockStickBundle.IGNITION_STAGE);
            if (stage>0) {
                probeInfo.text("\u70B9\u71C3\u72B6\u6001"+":"+stage);
            }
        }
    }
    @Override
    public String getID() {
        return "random.exu2.enderlilly";
    }
}
