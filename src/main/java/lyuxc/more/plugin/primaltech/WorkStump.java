package lyuxc.more.plugin.primaltech;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import primal_tech.tiles.TileEntityWorkStump;

public class WorkStump implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileEntityWorkStump){
            TileEntityWorkStump tile = (TileEntityWorkStump) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text("\u5DF2\u4F7F\u7528"+":"+tile.damage);
            probeInfo.text("\u5DF2\u6572\u51FB"+":"+tile.strikes);
        }
    }
    @Override
    public String getID() {
        return "random.primaltech.workstump";
    }
}
