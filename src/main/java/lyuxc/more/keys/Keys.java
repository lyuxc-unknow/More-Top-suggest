package lyuxc.more.keys;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class Keys {
    public static KeyBinding jei_recipe;
    public static KeyBinding jei_using;
    public static void init(){
        jei_recipe = new KeyBinding("key.jei.recipe", KeyConflictContext.IN_GAME, Keyboard.KEY_NUMPAD1,"key.categories.mtc");
        jei_using = new KeyBinding("key.jei.using", KeyConflictContext.IN_GAME, Keyboard.KEY_NUMPAD2,"key.categories.mtc");
        ClientRegistry.registerKeyBinding(Keys.jei_recipe);
        ClientRegistry.registerKeyBinding(Keys.jei_using);
    }
}
