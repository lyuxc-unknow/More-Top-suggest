package lyuxc.more.plugin.skyresources;

import com.bartz24.skyresources.technology.tile.MiniFreezerTile;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class Freezer implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof MiniFreezerTile) {
            MiniFreezerTile tile = (MiniFreezerTile) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text(I18n.translateToLocal("random.SkyResources.Speed") +":"+(int)(tile.getFreezerSpeed()*100)+"%");
        }
    }

    @Override
    public String getID() {
        return "random.skyresources.freezer";
    }
}
