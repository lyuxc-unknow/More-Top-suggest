package lyuxc.more.plugin.skyresources;
/*
import com.bartz24.skyresources.technology.block.BlockFreezer;
import com.bartz24.skyresources.technology.block.BlockLightFreezer;
import com.bartz24.skyresources.technology.tile.LightFreezerTile;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.config.Config;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class LightFreezer implements IProbeInfoProvider {
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        TileEntity lightFreezer = world.getTileEntity(data.getPos());
        boolean v = Config.harvestStyleVanilla;
        int offs = v ? 16 : 0;
        int dim = v ? 13 : 16;
        boolean valid = false;
        if (lightFreezer instanceof LightFreezerTile) {
            BlockPos blockPos = (world.getBlockState(data.getPos()).getProperties().get(BlockLightFreezer.PART)==BlockFreezer.EnumPartType.BOTTOM)?data.getPos():data.getPos().down();
            valid = ((LightFreezerTile)lightFreezer).hasValidMulti();
        }
        probeInfo.horizontal(probeInfo.defaultLayoutStyle().alignment(ElementAlignment.ALIGN_CENTER))
                .icon(new ResourceLocation("theoneprobe", "textures/gui/icons.png"), valid ? 0 : 16, offs, dim, dim, probeInfo
                        .defaultIconStyle().width(v ? 18 : 20).height(v ? 14 : 16).textureWidth(32)
                        .textureHeight(32))
                .text((valid ? (TextFormatting.GREEN + "Valid ") : (TextFormatting.YELLOW + "Invalid ")) + "Multiblock");
    }
    public String getID() {
        return "random.skyresources.multiblock";
    }
}
*/