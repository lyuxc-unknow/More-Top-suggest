package lyuxc.more.plugin.bloodmagic;

import WayofTime.bloodmagic.tile.TileIncenseAltar;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class IncenseAltar implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileIncenseAltar){
            TileIncenseAltar tile = (TileIncenseAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text("\u718F\u9999\u52A0\u6210"+":"+tile.incenseAddition);
        }
    }
    @Override
    public String getID() {
        return "random.bloodmagic.incensealtar";
    }
}