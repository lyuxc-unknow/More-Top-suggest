package lyuxc.more;

//import lyuxc.more.keys.Keys;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = MoreTopCompatible.MOD_ID,
        name = MoreTopCompatible.MOD_NAME,
        version = "0.0.12",
        guiFactory = MoreTopCompatible.GuiFactory,
        dependencies = "required-after:theoneprobe"
)
public class MoreTopCompatible {
    public static final String MOD_ID = "moretopcompatible";
    public static final String MOD_NAME = "MoreTopCompatible";
    public static final String GuiFactory = "lyuxc.more.config.ConfigGuiFactory";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        TOPRegister.registerTips();
        //Keys.init();
    }
}
