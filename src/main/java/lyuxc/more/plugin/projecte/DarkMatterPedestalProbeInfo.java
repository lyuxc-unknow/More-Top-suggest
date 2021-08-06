package lyuxc.more.plugin.projecte;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import moze_intel.projecte.gameObjs.tiles.DMPedestalTile;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class DarkMatterPedestalProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof DMPedestalTile){
            DMPedestalTile tile = (DMPedestalTile) world.getTileEntity(data.getPos());
            assert tile != null;
            if(tile.getActive()){
                probeInfo.text(I18n.translateToLocal("random.ProjectE.ActiveState") +":"+I18n.translateToLocal("random.ProjectE.Activated"));
            }else{
                probeInfo.text(I18n.translateToLocal("random.ProjectE.ActiveState")+":"+I18n.translateToLocal("random.ProjectE.Inactivated"));
            }
        }
    }
    @Override
    public String getID() {
        return "random.projecte.DMPedestal";
    }
}
