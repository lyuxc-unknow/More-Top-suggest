package lyuxc.more.keys;

import lyuxc.more.config.ConfigHandler;
import lyuxc.more.plugin.jei.JEIHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

@Mod.EventBusSubscriber
public class KeyEvent {
    @SubscribeEvent
    public static void KE(InputEvent.KeyInputEvent event){
        if(Loader.isModLoaded("jei")){
            Minecraft mc = Minecraft.getMinecraft();
            EntityPlayer player = mc.player;
            World world = mc.world;
            BlockPos pos = mc.objectMouseOver.getBlockPos();
            if(Keys.jei_using.isKeyDown() && ConfigHandler.moreTopCompatibleConfig.keyevent){
                IBlockState block = world.getBlockState(pos);
                Block block1 = block.getBlock();
                ItemStack itemStack = block1.getItem(world,pos,block);
                if (!itemStack.isEmpty())
                    JEIHandler.displayUses(itemStack);
            }
            if(Keys.jei_recipe.isKeyDown() && ConfigHandler.moreTopCompatibleConfig.keyevent){
                IBlockState block = world.getBlockState(pos);
                Block block1 = block.getBlock();
                ItemStack itemStack = block1.getItem(world,pos,block);
                if(!itemStack.isEmpty()){
                    JEIHandler.displayRecipes(itemStack);
                }
            }
        }
    }
}
