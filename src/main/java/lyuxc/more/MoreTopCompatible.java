package lyuxc.more;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;
import java.util.HashMap;

@Mod(
        modid = MoreTopCompatible.MOD_ID,
        name = MoreTopCompatible.MOD_NAME,
        version = "0.0.7",
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
    }
}
