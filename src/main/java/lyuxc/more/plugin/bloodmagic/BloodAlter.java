package lyuxc.more.plugin.bloodmagic;

import WayofTime.bloodmagic.tile.TileAltar;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BloodAlter implements IProbeInfoProvider{
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileAltar){
            TileAltar tile = (TileAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text("\u796D\u575B\u7B49\u7EA7"+":"+tile.getTier().toInt());
            probeInfo.text("\u5DF2\u6D88\u8017LP"+": "+tile.getProgress()+" LP");
        }
    }
    @Override
    public String getID() {
        return "random.bloodmagic.alter";
    }
}