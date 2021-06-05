package lyuxc.more.plugin;
import com.sci.torcherino.blocks.tiles.TileTorcherino;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class torcherino implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        if(world.getTileEntity(data.getPos())instanceof TileTorcherino){
            TileTorcherino tileTorcherino = (TileTorcherino) world.getTileEntity(data.getPos());
            assert tileTorcherino != null;
            probeInfo.text(tileTorcherino.getDescription().getText());
            if(player.getName().equals("Tyumen_")){
                probeInfo.text("You Can't Use It!");
            }
        }
    }
    @Override
    public String getID() {
        return "random.torcherino." + this;
    }
}
