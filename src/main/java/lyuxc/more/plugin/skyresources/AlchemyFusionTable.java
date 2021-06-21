package lyuxc.more.plugin.skyresources;

import com.bartz24.skyresources.alchemy.tile.TileAlchemyFusionTable;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class AlchemyFusionTable implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof TileAlchemyFusionTable) {
            TileAlchemyFusionTable tile = (TileAlchemyFusionTable) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text("\u50AC\u5316\u5242\u500D\u7387"+":"+(int)(tile.getCurItemYield()*100)+"%");
            probeInfo.text("\u8017\u6750\u8FDB\u5EA6"+":"+tile.getProgress()+"%");
            probeInfo.text("\u704C\u6CE8\u8FDB\u5EA6"+":"+(int)(tile.getCurYield()*100)+"%");
            probeInfo.text("\u50AC\u5316\u5242\u5269\u4F59"+":"+(int)(tile.getCurItemLeft()*100)+"%");
        }
    }

    @Override
    public String getID() {
        return "random.skyresources.alchemyfusiontable";
    }
}
