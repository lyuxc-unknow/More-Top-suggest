package lyuxc.more.config;

import lyuxc.more.MoreTopCompatible;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ChanceConfigEvent {
    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(MoreTopCompatible.MOD_ID)) {
            ConfigManager.sync(MoreTopCompatible.MOD_ID, Config.Type.INSTANCE);
        }
    }
}
