package lyuxc.more.plugin.omegacraft;

import com.cobbs.omegacraft.Blocks.Generators.Magmite.MagTE;
import mcjty.theoneprobe.api.*;
import mcjty.theoneprobe.apiimpl.styles.ProgressStyle;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.awt.*;

public class mag_mite implements IProbeInfoProvider {
    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        if (world.getTileEntity(data.getPos()) instanceof MagTE) {
            MagTE te = (MagTE) world.getTileEntity(data.getPos());
            assert te != null;
            int r = Color.red.getRGB();
            int o = Color.orange.getRGB();
            int g = Color.gray.getRGB();
            int black = Color.black.getRGB();
            int p = Color.magenta.getRGB();
            if (te.heat > 0) {
                probeInfo.progress(te.heat, te.maxHeat, new ProgressStyle().prefix("\u70ED\u91CF" + ":" + te.heat).suffix("/" + te.maxHeat)
                        .width(100)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(r)
                        .backgroundColor(g)
                        .filledColor(o)
                        .alternateFilledColor(o));
            }
            if(te.cave_fuel&te.fuelLevel>0){
                probeInfo.progress(te.fuelLevel, te.maxFuel, new ProgressStyle().prefix("\u71C3\u6599" + ":" + te.fuelLevel).suffix("/" + te.maxFuel)
                        .width(100)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(black)
                        .backgroundColor(g)
                        .filledColor(p)
                        .alternateFilledColor(p));
            }else if(!te.cave_fuel&te.fuelLevel>0){
                probeInfo.progress(te.fuelLevel, te.maxFuel, new ProgressStyle().prefix("\u71C3\u6599" + ":" + te.fuelLevel).suffix("/" + te.maxFuel)
                        .width(100)
                        .numberFormat(NumberFormat.NONE)
                        .borderColor(black)
                        .backgroundColor(g)
                        .filledColor(r)
                        .alternateFilledColor(r));
            }
        }
    }
    @Override
    public String getID(){return "random.omegacraft.magmite";}
}