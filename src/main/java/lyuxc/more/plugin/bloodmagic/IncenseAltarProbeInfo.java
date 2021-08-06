package lyuxc.more.plugin.bloodmagic;

import WayofTime.bloodmagic.tile.TileIncenseAltar;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class IncenseAltarProbeInfo implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileIncenseAltar){
            TileIncenseAltar tile = (TileIncenseAltar) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text(I18n.translateToLocal("random.BloodMagic.IncenseAlter.IncenseAddition")+": "+(int)(tile.incenseAddition*100)+"%");
            probeInfo.text(I18n.translateToLocal("random.BloodMagic.IncenseAlter.Tranquility") +": "+(int)(100*tile.tranquility));
        }
    }
    @Override
    public String getID() {
        return "random.bloodmagic.incensealtar";
    }
}