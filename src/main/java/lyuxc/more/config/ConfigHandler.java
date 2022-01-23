package lyuxc.more.config;

import lyuxc.more.MoreTopCompatible;
import net.minecraftforge.common.config.Config;

@Config(modid = MoreTopCompatible.MOD_ID)
public class ConfigHandler {
    public static MoreTopCompatibleConfig moreTopCompatibleConfig = new MoreTopCompatibleConfig();
    public static class MoreTopCompatibleConfig{
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable Botnaia support [default : true]")
        public boolean botania = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable Embers support [default : true]")
        public boolean embers = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable EXU2 support [default : true]")
        public boolean exu2 = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable LordCraft support [default : true]")
        public boolean lordcraft = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable OmegaCraft support [default : true]")
        public boolean omegacraft = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable Torcherino support [default : true]")
        public boolean torcherino = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable ChanceCubes support [default : true]")
        public boolean chancecubes = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable AstralSorcery support [default : true]")
        public boolean astralsorcery = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable BloodMagic support [default : false]")
        public boolean bloodmagic = false;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable MoreBloodMagic support [default : true]")
        public boolean bloodmagicmore = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable SkyResources support [default : true]")
        public boolean skyresources = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable ProjectE support [default : true]")
        public boolean projecre = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable ProjectEProbeInfo support [default : true]")
        public boolean peprobe = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable PromalTech support [default : true]")
        public boolean primaltech = true;
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable ExtendedCrafting support [default : true]")
        public boolean extendedcrafting = true;
        /*
        @Config.RequiresMcRestart
        @Config.Comment("If true,This will enable KeyEvent(has much BUG!)[default : false]")
        public boolean keyevent = false;
         */
    }
}
