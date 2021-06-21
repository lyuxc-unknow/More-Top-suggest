package lyuxc.more.plugin.projecte;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import moze_intel.projecte.gameObjs.tiles.DMPedestalTile;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class DMPedestal implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof DMPedestalTile){
            DMPedestalTile tile = (DMPedestalTile) world.getTileEntity(data.getPos());
            assert tile != null;
            if(tile.getActive()){
                probeInfo.text("\u6FC0\u6D3B\u72B6\u6001"+":"+"\u5DF2\u6FC0\u6D3B");
            }else{
                probeInfo.text("\u6FC0\u6D3B\u72B6\u6001"+":"+"\u672A\u6FC0\u6D3B");
            }
        }
    }
    @Override
    public String getID() {
        return "random.projecte.DMPedestal";
    }
}
