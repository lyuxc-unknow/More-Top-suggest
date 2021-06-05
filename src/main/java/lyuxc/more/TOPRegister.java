package lyuxc.more;

import lyuxc.more.plugin.astralsorcery.alter;
import lyuxc.more.plugin.bloodmagic.BloodAlter;
import lyuxc.more.plugin.bloodmagic.IncenseAltar;
import lyuxc.more.plugin.botania.*;
import lyuxc.more.plugin.botania.botaniaadditions.DreamingPool;
import lyuxc.more.plugin.botania.botaniaadditions.ElvenAltar;
import lyuxc.more.plugin.botania.botaniaadditions.GaiaPlate;
import lyuxc.more.plugin.chancecubes.chanceD20;
import lyuxc.more.plugin.chancecubes.chancecubes;
import lyuxc.more.plugin.embers.*;
import lyuxc.more.plugin.embers.soot.AlchemyGlobe;
import lyuxc.more.plugin.embers.soot.EmberBurst;
import lyuxc.more.plugin.exu2.exu_enderlilly;
import lyuxc.more.plugin.exu2.exu_mac;
import lyuxc.more.plugin.lordcraft.void_altar;
import lyuxc.more.plugin.omegacraft.dark_maker;
import lyuxc.more.plugin.omegacraft.mag_mite;
import lyuxc.more.plugin.torcherino;
import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;
import net.minecraftforge.fml.common.Loader;

public class TOPRegister {
    public static void registerTips() {
        TheOneProbeImp theOneProbeImp = TheOneProbe.theOneProbeImp;//torcherino
        if(Loader.isModLoaded("torcherino")& ConfigHandler.torcherino){
            theOneProbeImp.registerProvider(new torcherino());
        }
        //exu2
        if(Loader.isModLoaded("extrautils2")&ConfigHandler.exu2){
            theOneProbeImp.registerProvider(new exu_enderlilly());
            theOneProbeImp.registerProvider(new exu_mac());
        }
        //embers
        if(Loader.isModLoaded("embers")&ConfigHandler.embers){
            theOneProbeImp.registerProvider(new ember_power());
            theOneProbeImp.registerProvider(new ember_auto_hummer());
            theOneProbeImp.registerProvider(new ember_beam_cannon());
            theOneProbeImp.registerProvider(new ember_cinder_plinth());
            theOneProbeImp.registerProvider(new ember_furnace());
            theOneProbeImp.registerProvider(new ember_mixer());
            theOneProbeImp.registerProvider(new ember_stamper());
            theOneProbeImp.registerProvider(new ember_crystal_cell());
            theOneProbeImp.registerProvider(new ember_emitter());
            theOneProbeImp.registerProvider(new ember_receiver());
            theOneProbeImp.registerProvider(new ember_activator());
            theOneProbeImp.registerProvider(new ember_BeamSplitter());
            theOneProbeImp.registerProvider(new ember_alchemy_pedestal());
            theOneProbeImp.registerProvider(new ember_emberinjector());
            theOneProbeImp.registerProvider(new ember_reactor());
            theOneProbeImp.registerProvider(new ember_pulser());
            theOneProbeImp.registerProvider(new ember_funnel());
            theOneProbeImp.registerProvider(new ember_charber());
            theOneProbeImp.registerProvider(new ember_mechanical_pump());
            theOneProbeImp.registerProvider(new ember_boiler());
        }
        //botania
        if(Loader.isModLoaded("botania")&ConfigHandler.botania){
            theOneProbeImp.registerProvider(new pool());
            theOneProbeImp.registerProvider(new runealtar());
            theOneProbeImp.registerProvider(new spreader());
            theOneProbeImp.registerProvider(new brewery());
            theOneProbeImp.registerProvider(new terraplate());
        }
        //botania-additions
        if(Loader.isModLoaded("botanicadds")&ConfigHandler.botania){
            theOneProbeImp.registerProvider(new DreamingPool());
            theOneProbeImp.registerProvider(new ElvenAltar());
            theOneProbeImp.registerProvider(new GaiaPlate());
        }
        //lord-craft
        if(Loader.isModLoaded("lordcraft")&ConfigHandler.lordcraft){
            theOneProbeImp.registerProvider(new void_altar());
        }
        //omega-craft
        if(Loader.isModLoaded("omegacraft")&ConfigHandler.omegacraft){
            theOneProbeImp.registerProvider(new dark_maker());
            theOneProbeImp.registerProvider(new mag_mite());
        }
        if(Loader.isModLoaded("soot")&ConfigHandler.embers){
            theOneProbeImp.registerProvider(new EmberBurst());
            theOneProbeImp.registerProvider(new AlchemyGlobe());
        }
        if(Loader.isModLoaded("chancecubes")&ConfigHandler.chancecubes){
            theOneProbeImp.registerProvider(new chancecubes());
            theOneProbeImp.registerProvider(new chanceD20());
        }
        if(Loader.isModLoaded("astralsorcery")&ConfigHandler.astralsorcery){
            theOneProbeImp.registerProvider(new alter());
        }
        if(Loader.isModLoaded("bloodmagic")&ConfigHandler.bloodmagic){
            theOneProbeImp.registerProvider(new BloodAlter());
            theOneProbeImp.registerProvider(new IncenseAltar());
        }
    }
}
