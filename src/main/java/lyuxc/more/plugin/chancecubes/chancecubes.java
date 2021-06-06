package lyuxc.more.plugin.chancecubes;

import chanceCubes.tileentities.TileChanceCube;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class chancecubes implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileChanceCube){
            TileChanceCube tile = (TileChanceCube) world.getTileEntity(data.getPos());
            assert tile != null;
            probeInfo.text("\u673A\u4F1A\u503C"+ ":" +tile.getChance());

        }
    }
    @Override
    public String getID() {
        return "random.chancecubes.chanceblock";
    }
}