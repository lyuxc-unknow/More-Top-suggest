package lyuxc.more.plugin.embers.soot;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import soot.tile.TileEntityAlchemyGlobe;

public class AlchemyGlobe implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileEntityAlchemyGlobe){
            TileEntityAlchemyGlobe tile = (TileEntityAlchemyGlobe) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text(I18n.translateToLocal("random.Embers.Aspects") + ":" + tile.getAspects().getAspects());
        }
    }
    @Override
    public String getID() {
        return "random.soot.alchemyglobe";
    }
}
