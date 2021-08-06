package lyuxc.more;

import lyuxc.more.plugin.astralsorcery.AlterProbeInfo;
import lyuxc.more.plugin.bloodmagic.BloodAlterProbeInfo;
import lyuxc.more.plugin.bloodmagic.IncenseAltarProbeInfo;
import lyuxc.more.plugin.botania.botaniaadditions.DreamingPoolProbeInfo;
import lyuxc.more.plugin.botania.botaniaadditions.ElvenAltarProbeInfo;
import lyuxc.more.plugin.botania.botaniaadditions.GaiaPlateProbeInfo;
import lyuxc.more.plugin.botania.*;
import lyuxc.more.plugin.chancecubes.ChanceD20ProbeInfo;
import lyuxc.more.plugin.chancecubes.ChanceCubesProbeInfo;
import lyuxc.more.plugin.embers.*;
import lyuxc.more.plugin.embers.soot.AlchemyGlobeProbeInfo;
import lyuxc.more.plugin.embers.soot.EmberBurstProbeInfo;
import lyuxc.more.plugin.extendedcrafting.ExtendedCraftingProbeInfo;
import lyuxc.more.plugin.exu2.EnderLillyProbeInfo;
import lyuxc.more.plugin.exu2.MachineProbeInfo;
import lyuxc.more.plugin.lordcraft.EnergyProbe;
import lyuxc.more.plugin.lordcraft.VoidAlterProbeInfo;
import lyuxc.more.plugin.omegacraft.DarkMakerProbeInfo;
import lyuxc.more.plugin.omegacraft.MagProbeInfo;
import lyuxc.more.plugin.primaltech.*;
import lyuxc.more.plugin.projecte.*;
import lyuxc.more.plugin.skyresources.AlchemyFusionTableProbeInfo;
import lyuxc.more.plugin.skyresources.FreezerProbeInfo;
import lyuxc.more.plugin.skyresources.LightFreezerProbeInfo;
import lyuxc.more.plugin.torcherino.TorcherinoProbeInfo;
import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;
import net.minecraftforge.fml.common.Loader;

public class TOPRegister {
    public static void registerTips() {
        TheOneProbeImp theOneProbeImp = TheOneProbe.theOneProbeImp;
        //Torcherino
        if(Loader.isModLoaded("torcherino")& ConfigHandler.torcherino)
            theOneProbeImp.registerProvider(new TorcherinoProbeInfo());
        //Extra utils
        if(Loader.isModLoaded("extrautils2")&ConfigHandler.exu2){
            theOneProbeImp.registerProvider(new EnderLillyProbeInfo());
            theOneProbeImp.registerProvider(new MachineProbeInfo());
        }
        //Embers
        if(Loader.isModLoaded("embers")&ConfigHandler.embers){
            theOneProbeImp.registerProvider(new PowerProbeInfo());
            theOneProbeImp.registerProvider(new AutoHummerProbeInfo());
            theOneProbeImp.registerProvider(new BeamCannonProbeInfo());
            theOneProbeImp.registerProvider(new CinderPlinthProbeInfo());
            theOneProbeImp.registerProvider(new FurnaceProbeInfo());
            theOneProbeImp.registerProvider(new MixerProbeInfo());
            theOneProbeImp.registerProvider(new StamperProbeInfo());
            theOneProbeImp.registerProvider(new CrystalCellProbeInfo());
            theOneProbeImp.registerProvider(new EmitterProbeInfo());
            theOneProbeImp.registerProvider(new ReceiverProbeInfo());
            theOneProbeImp.registerProvider(new ActivatorProbeInfo());
            theOneProbeImp.registerProvider(new BeamSplitterProbeInfo());
            theOneProbeImp.registerProvider(new AlchemyPedestalProbeInfo());
            theOneProbeImp.registerProvider(new EmberInjectorProbeInfo());
            theOneProbeImp.registerProvider(new ReactorProbeInfo());
            theOneProbeImp.registerProvider(new PulserProbeInfo());
            theOneProbeImp.registerProvider(new FunnelProbeInfo());
            theOneProbeImp.registerProvider(new CharberProbeInfo());
            theOneProbeImp.registerProvider(new MechanicalPumpProbeInfo());
            theOneProbeImp.registerProvider(new BoilerProbeInfo());
        }
        //Botania
        if(Loader.isModLoaded("botania")&ConfigHandler.botania){
            theOneProbeImp.registerProvider(new ManaPoolProbeInfo());
            theOneProbeImp.registerProvider(new RuneAlterProbeInfo());
            theOneProbeImp.registerProvider(new SpreaderProbeInfo());
            theOneProbeImp.registerProvider(new BreweryProbeInfo());
            theOneProbeImp.registerProvider(new TerraPlateProbeInfo());
        }
        //Botania Addition
        if(Loader.isModLoaded("botanicadds")&ConfigHandler.botania){
            theOneProbeImp.registerProvider(new DreamingPoolProbeInfo());
            theOneProbeImp.registerProvider(new ElvenAltarProbeInfo());
            theOneProbeImp.registerProvider(new GaiaPlateProbeInfo());
        }
        //Lord Craft
        if(Loader.isModLoaded("lordcraft")&ConfigHandler.lordcraft) {
            theOneProbeImp.registerProvider(new VoidAlterProbeInfo());
            theOneProbeImp.registerProvider(new EnergyProbe());
        }
        //Omega Craft
        if(Loader.isModLoaded("omegacraft")&ConfigHandler.omegacraft){
            theOneProbeImp.registerProvider(new DarkMakerProbeInfo());
            theOneProbeImp.registerProvider(new MagProbeInfo());
        }
        //Soot
        if(Loader.isModLoaded("soot")&ConfigHandler.embers){
            theOneProbeImp.registerProvider(new EmberBurstProbeInfo());
            theOneProbeImp.registerProvider(new AlchemyGlobeProbeInfo());
        }
        //Chance Cubes
        if(Loader.isModLoaded("chancecubes")&ConfigHandler.chancecubes){
            theOneProbeImp.registerProvider(new ChanceCubesProbeInfo());
            theOneProbeImp.registerProvider(new ChanceD20ProbeInfo());
        }
        //Astral Sorcery
        if(Loader.isModLoaded("astralsorcery")&ConfigHandler.astralsorcery)
            theOneProbeImp.registerProvider(new AlterProbeInfo());
        //Blood Magic
        if(Loader.isModLoaded("bloodmagic")&ConfigHandler.bloodmagic){
            theOneProbeImp.registerProvider(new BloodAlterProbeInfo());
            if(ConfigHandler.bloodmagicmore){
                theOneProbeImp.registerProvider(new IncenseAltarProbeInfo());
            }
        }
        //Sky Resources
        if(Loader.isModLoaded("skyresources")&ConfigHandler.skyresources){
            theOneProbeImp.registerProvider(new FreezerProbeInfo());
            theOneProbeImp.registerProvider(new LightFreezerProbeInfo());
            theOneProbeImp.registerProvider(new AlchemyFusionTableProbeInfo());
        }
        //ProjectE
        if(Loader.isModLoaded("projecte")&ConfigHandler.projecre){
            theOneProbeImp.registerProvider(new DarkMatterPedestalProbeInfo());
            theOneProbeImp.registerProvider(new CollectorProbeInfo());
            theOneProbeImp.registerProvider(new CondenserProbeInfo());
            theOneProbeImp.registerProvider(new RelayProbeInfo());
        }
        if(Loader.isModLoaded("projecte")&ConfigHandler.peprobe)
            theOneProbeImp.registerProvider(new ProjectEProbeInfo());
        //PrimalTech
        if(Loader.isModLoaded("primal_tech")&ConfigHandler.primaltech){
            theOneProbeImp.registerProvider(new WaterSawProbeInfo());
            theOneProbeImp.registerProvider(new StoneGrillProbeInfo());
            theOneProbeImp.registerProvider(new KilnProbeInfo());
            theOneProbeImp.registerProvider(new WorkStumpProbeInfo());
            theOneProbeImp.registerProvider(new StoneAnvilProbeInfo());
            theOneProbeImp.registerProvider(new StackBundleProbeInfo());
        }
        //ExtendedCrafting
        if(Loader.isModLoaded("extendedcrafting")&ConfigHandler.extendedcrafting)
            theOneProbeImp.registerProvider(new ExtendedCraftingProbeInfo());
    }
}
