package lyuxc.more;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
    public static boolean botania = true;
    public static boolean embers = true;
    public static boolean exu2 = true;
    public static boolean lordcraft = true;
    public static boolean omegacraft = true;
    public static boolean torcherino = true;
    public static boolean chancecubes = true;
    public static boolean astralsorcery = true;
    public static boolean bloodmagic = true;
    public static boolean bloodmagicmore = false;

    public static void ReadConfig(){
        Configuration config = MoreTopCompatible.configuration;
        try{
            config.load();
            InitEnable(config);
        }finally {
            if(config.hasChanged()){
                config.save();
            }
        }
    }
    private static void InitEnable(Configuration config){
        botania = config.getBoolean("Whether to Enable","Botania",botania,"Enable Botania Compatible","config.enable.botania");
        embers = config.getBoolean("Whether to Enable","Embers",embers,"Enable Embers Compatible","config.enable.embers");
        exu2 = config.getBoolean("Whether to Enable","ExU2",exu2,"Enable ExU2 Compatible","config.enable.botania");
        lordcraft = config.getBoolean("Whether to Enable","LordCraft",lordcraft,"Enable Lord Craft Compatible","config.enable.lordcraft");
        omegacraft = config.getBoolean("Whether to Enable","OmegaCraft",omegacraft,"Enable Omega Craft Compatible","config.enable.omegacraft");
        torcherino = config.getBoolean("Whether to Enable","Torcherino",torcherino,"Enable Torcherino Compatible","config.enable.torcherino");
        chancecubes = config.getBoolean("Whether to Enable","ChanceCubes",chancecubes,"Enable ChanceCubes Compatible","config.chancecubes");
        astralsorcery = config.getBoolean("Whether to Enable","AstralSorcery",astralsorcery,"Enable AstralSorcery Compatible","config.astralsorcery");
        bloodmagic = config.getBoolean("Whether to Enable","BloodMagic",bloodmagic,"Enable BloodMagic Compatible","config.magic");
        bloodmagicmore = config.getBoolean("Whether to Enable","BloodMagicMore",bloodmagicmore,"Enable BloodMagicMore Compatible","config.magic.more");
    }
}
