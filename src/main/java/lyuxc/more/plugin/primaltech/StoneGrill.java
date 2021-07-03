package lyuxc.more.plugin.primaltech;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import primal_tech.tiles.TileEntityStoneGrill;

public class StoneGrill implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileEntityStoneGrill){
            TileEntityStoneGrill tile = (TileEntityStoneGrill) world.getTileEntity(data.getPos());
            assert tile != null;
            if(tile.getTemp()>0){
                probeInfo.text(I18n.translateToLocal("random.PrimalTech.Progress") +":"+(tile.getTemp()/2)+"%");
            }
        }
    }
    @Override
    public String getID() {
        return "random.primaltech.stonegrill";
    }
}
