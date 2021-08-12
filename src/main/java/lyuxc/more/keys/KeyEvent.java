package lyuxc.more.keys;

import lyuxc.more.plugin.jei.JEIHandler;
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
            IBlockState block = player.world.getBlockState(pos);
            ItemStack itemStack = block.getBlock().getItem(world,pos,block);
            if(Keys.jei_using.isPressed()){
                if (!itemStack.isEmpty())
                    JEIHandler.displayUses(itemStack);
            }
            if(Keys.jei_recipe.isPressed()){
                if(!itemStack.isEmpty()){
                    JEIHandler.displayRecipes(itemStack);
                }
            }
        }
    }
}
