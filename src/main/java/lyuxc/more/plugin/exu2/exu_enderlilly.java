package lyuxc.more.plugin.exu2;

import com.rwtema.extrautils2.blocks.BlockEnderLilly;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class exu_enderlilly implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (blockState.getBlock() instanceof BlockEnderLilly) {
            int growth = blockState.getValue(BlockEnderLilly.GROWTH_STATE);
            if (growth == 7) {
                probeInfo.text("\u00A7aFully grown");
            } else {
                probeInfo.text("\u00A77Growth:\u00A7r" + growth);
            }
        }
    }
    @Override
    public String getID() {
        return "random.exu2.enderlilly";
    }
}
