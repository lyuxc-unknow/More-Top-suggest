package lyuxc.more.config;

import lyuxc.more.MoreTopCompatible;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

import java.util.Collections;
import java.util.Set;

@SuppressWarnings("unused")
public class ConfigGuiFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraft){

    }
    @Override
    public boolean hasConfigGui(){
        return true;
    }
    @Override
    public GuiScreen createConfigGui(GuiScreen guiScreen){
        return new GuiConfig(guiScreen, ConfigElement.from(ConfigHandler.class).getChildElements(),MoreTopCompatible.MOD_ID,false,false,"MoreTopCompatible");
    }
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return Collections.emptySet();
    }
}
