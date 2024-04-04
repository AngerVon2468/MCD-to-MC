package net.mavity.mcd_to_mc.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.mavity.mcd_to_mc.MCDungeonsToMC;

@Config(name = MCDungeonsToMC.MOD_ID)
public class MCDConfig implements ConfigData {
    public boolean doMCDEnchantments = true;
    public boolean doOptionalEnchantments = true;
}
