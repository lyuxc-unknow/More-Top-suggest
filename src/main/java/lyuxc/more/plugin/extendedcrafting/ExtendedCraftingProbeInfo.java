package lyuxc.more.plugin.extendedcrafting;

import com.blakebr0.cucumber.util.Utils;
import com.blakebr0.extendedcrafting.block.*;
import com.blakebr0.extendedcrafting.block.craftingtable.BlockAdvancedTable;
import com.blakebr0.extendedcrafting.block.craftingtable.BlockBasicTable;
import com.blakebr0.extendedcrafting.block.craftingtable.BlockEliteTable;
import com.blakebr0.extendedcrafting.block.craftingtable.BlockUltimateTable;
import com.blakebr0.extendedcrafting.crafting.CombinationRecipe;
import com.blakebr0.extendedcrafting.crafting.CompressorRecipe;
import com.blakebr0.extendedcrafting.tile.*;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ExtendedCraftingProbeInfo implements IProbeInfoProvider {
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data){
        Block block = blockState.getBlock();
        TileEntity tile = world.getTileEntity(data.getPos());

        if(block instanceof BlockPedestal && tile instanceof TilePedestal && !tile.isInvalid()){
            TilePedestal pedestal = (TilePedestal) tile;
            ItemStack result = pedestal.getStack();
            if(!result.isEmpty()){
                probeInfo.text(result.getDisplayName());
            }
        }
        if(block instanceof BlockCraftingCore && tile instanceof TileCraftingCore && !tile.isInvalid()){
            TileCraftingCore core = (TileCraftingCore) tile;
            CombinationRecipe recipe = core.getRecipe();
            if(recipe != null){
                ItemStack output = recipe.getOutput();
                probeInfo.text(Utils.localize("random.ExtendedCrafting.crafting",output.getDisplayName()+"*"+output.getCount()));
            }
        }

        if(block instanceof BlockBasicTable) probeInfo.text(Utils.localize("random.ExtendedCrafting.tier",1));
        if(block instanceof BlockAdvancedTable) probeInfo.text(Utils.localize("random.ExtendedCrafting.tier",2));
        if(block instanceof BlockEliteTable) probeInfo.text(Utils.localize("random.ExtendedCrafting.tier",3));
        if(block instanceof BlockUltimateTable) probeInfo.text(Utils.localize("random.ExtendedCrafting.tier",4));

        if(block instanceof BlockAutomationInterface && tile instanceof TileAutomationInterface && !tile.isInvalid()){
            TileAutomationInterface auto = (TileAutomationInterface) tile;
            ItemStack result = auto.getResult();
            if(!result.isEmpty()){
                probeInfo.text(Utils.localize("random.ExtendedCrafting.crafting",result.getDisplayName()+"*"+result.getCount()));
            }
        }

        if(block instanceof BlockEnderCrafter && tile instanceof TileEnderCrafter && !tile.isInvalid()){
            TileEnderCrafter crafter = (TileEnderCrafter) tile;
            ItemStack result = crafter.getResult();
            if(!result.isEmpty()){
                probeInfo.text(Utils.localize("random.ExtendedCrafting.output",result.getDisplayName()+"*"+result.getCount()));
            }
        }
        if(block instanceof BlockCompressor && tile instanceof TileCompressor && !tile.isInvalid()){
            TileCompressor compressor = (TileCompressor) tile;
            CompressorRecipe recipe = compressor.getRecipe();
            if(recipe != null){
                ItemStack output = recipe.getOutput();
                probeInfo.text(Utils.localize("random.ExtendedCrafting.crafting",output.getDisplayName()+"*"+output.getCount()));
            }
        }
    }
    public String getID() {
        return "random.extendedcrafting";
    }
}
