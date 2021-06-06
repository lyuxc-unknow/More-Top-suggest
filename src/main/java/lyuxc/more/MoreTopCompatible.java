package lyuxc.more;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(
        modid = MoreTopCompatible.MOD_ID,
        name = MoreTopCompatible.MOD_NAME,
        version = "0.0.2",
        dependencies = "after:torcherino;" +
                "required-after:theoneprobe;" +
                "after:extrautils2;" +
                "after:embers;" +
                "after:botanicadds;" +
                "after:botania_tweaks;"+
                "after:omegacraft;"+
                "after:lordcraft;"+
                "after:torcherino;"+
                "after:soot;"+
                "after:astralsorcery;"+
                "after:chancecubes;"
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