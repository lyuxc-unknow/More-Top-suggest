package lyuxc.more;

import lyuxc.more.keys.Keys;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

import java.io.File;

@Mod(
        modid = MoreTopCompatible.MOD_ID,
        name = MoreTopCompatible.MOD_NAME,
        version = "0.0.11",
        dependencies = "required-after:theoneprobe"
)
public class MoreTopCompatible {
    public static final String MOD_ID = "moretopcompatible";
    public static final String MOD_NAME = "MoreTopCompatible";
    public static Configuration configuration;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
        File dir = event.getModConfigurationDirectory();
        configuration = new Configuration(new File(dir.getPath(), "moretopcompatible.cfg"));
        ConfigHandler.ReadConfig();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        TOPRegister.registerTips();
        Keys.jei_using = new KeyBinding("key.jei.using", KeyConflictContext.IN_GAME, Keyboard.KEY_NUMPAD1,"key.categories.mtc");
        Keys.jei_recipe = new KeyBinding("key.jei.recipe",KeyConflictContext.IN_GAME,Keyboard.KEY_NUMPAD2,"key.categories.mtc");
        ClientRegistry.registerKeyBinding(Keys.jei_using);
        ClientRegistry.registerKeyBinding(Keys.jei_recipe);
    }
}
