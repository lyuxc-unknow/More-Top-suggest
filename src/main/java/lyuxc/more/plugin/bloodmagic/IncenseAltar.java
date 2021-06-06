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
            probeInfo.text("\u589E\u76CA"+": "+(int)(tile.incenseAddition*100)+"%");
            probeInfo.text("\u5B81\u9759"+": "+(int)(100.0D*(int)(100.0D*tile.tranquility)/100.0D));
        }
    }
    @Override
    public String getID() {
        return "random.bloodmagic.incensealtar";
    }
}