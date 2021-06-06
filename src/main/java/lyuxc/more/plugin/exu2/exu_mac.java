package lyuxc.more.plugin.exu2;

import com.rwtema.extrautils2.machine.TileMachine;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class exu_mac implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileMachine){
            TileMachine tileMachine = (TileMachine) world.getTileEntity(data.getPos());
            assert tileMachine != null;
            probeInfo.text("\u8017\u65F6"+":"+tileMachine.totalTime/20+"s");
        }
    }
    @Override
    public String getID() {
        return "random.exu2.mac";
    }
}