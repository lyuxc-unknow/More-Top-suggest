package lyuxc.mtc;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreTopSuggest.MOD_ID)
public class MoreTopSuggest {
    public static final String MOD_ID = "more_top_suggest";

    public MoreTopSuggest(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::TOPPluginRegisterEvent);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void TOPPluginRegisterEvent(FMLCommonSetupEvent event){
        TOPRegister.register();
    }
}
