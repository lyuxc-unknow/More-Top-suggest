package lyuxc.mtc;

import lyuxc.mtc.plugin.botania.*;
import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;

public class TOPRegister{
    public static void register(){
        TheOneProbeImp theOneProbeImp = TheOneProbe.theOneProbeImp;
        theOneProbeImp.registerProvider(new ManaPoolProbeInfo());
        theOneProbeImp.registerProvider(new RuneAlterProbeInfo());
        theOneProbeImp.registerProvider(new BreweryProbeInfo());
        theOneProbeImp.registerProvider(new SpreaderProbeInfo());
        theOneProbeImp.registerProvider(new TerrPlateProbeInfo());
    }
}