package net.mavity.mcd_to_mc.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.mavity.mcd_to_mc.MCDungeonsToMC;

@Config(name = MCDungeonsToMC.MOD_ID)
public class MCDConfig implements ConfigData {
    public boolean doMCDEnchantments = true;
    public String warning = "Don't modify the doOptionalEnchantmentsLootTables unless you want to have progression breaks.";
    public boolean doOptionalEnchantmentsLootTables = false;
    public int maxOptionalEnchantLevel = 5;
    public int minOptionalEnchantLevel = 1;
    public int maxMCDEnchantLevel = 3;
    public int minMCDEnchantLevel = 1;
}
