package lyuxc.mtc;

import lyuxc.mtc.plugin.botania.manaPool;
import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.apiimpl.TheOneProbeImp;

public class TOPRegister{
    public static void register(){
        TheOneProbeImp theOneProbeImp = TheOneProbe.theOneProbeImp;
        theOneProbeImp.registerProvider(new manaPool());
    }
}