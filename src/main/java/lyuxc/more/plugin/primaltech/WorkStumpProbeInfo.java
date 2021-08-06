package lyuxc.more.plugin.primaltech;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import primal_tech.tiles.TileEntityWorkStump;

public class WorkStumpProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileEntityWorkStump){
            TileEntityWorkStump tile = (TileEntityWorkStump) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text(I18n.translateToLocal("random.PrimalTech.Used")+":"+tile.damage);
            probeInfo.text(I18n.translateToLocal("random.PrimalTech.Strikes")+":"+tile.strikes);
        }
    }
    @Override
    public String getID() {
        return "random.primaltech.workstump";
    }
}
