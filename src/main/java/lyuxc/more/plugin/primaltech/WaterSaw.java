package lyuxc.more.plugin.primaltech;

import com.sci.torcherino.blocks.tiles.TileTorcherino;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import primal_tech.tiles.TileEntityWaterSaw;

public class WaterSaw implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileEntityWaterSaw){
            TileEntityWaterSaw tile = (TileEntityWaterSaw) world.getTileEntity(data.getPos());
            assert tile != null;
            if(tile.getChoppingProgress()>0){
                probeInfo.text("\u8FDB\u5EA6"+":"+(int)(100*tile.getChoppingProgress()/ tile.getChoppingTime())+"%");
            }
        }
    }
    @Override
    public String getID() {
        return "random.primaltech.watersaw";
    }
}
