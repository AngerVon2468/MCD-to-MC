package net.mavity.mcd_to_mc;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import net.fabricmc.api.ModInitializer;

import net.mavity.mcd_to_mc.commandregister.CommandInit;
import net.mavity.mcd_to_mc.config.MCDConfig;
import net.mavity.mcd_to_mc.config.MavConfigSerializer;
import net.mavity.mcd_to_mc.enchantmentregister.FreezingEnchantment;
import net.mavity.mcd_to_mc.enchantmentregister.ThunderingEnchantment;
import net.mavity.mcd_to_mc.itemregister.ItemInit;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseAnchorType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseHammerType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseStaffType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseSwordType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCDungeonsToMC implements ModInitializer {
	public static final String MOD_ID = "mcd_to_mc";
	public static final String NAME = "MCDungeons To MC";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static Enchantment THUNDERING = new ThunderingEnchantment();
	public static Enchantment FREEZING = new FreezingEnchantment();
	public static final ConfigHolder<MCDConfig> CONFIG = AutoConfig.register(
			MCDConfig.class, MavConfigSerializer::new);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AutoConfig.getConfigHolder(MCDConfig.class).getConfig();
		CONFIG.load();

		MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered its' main class.");
		ItemInit.registerMCDItems();
		BaseAnchorType.registerMCDAnchorType();
		BaseHammerType.registerMCDHammerType();
		BaseSwordType.registerMCDSwordType();
		BaseStaffType.registerMCDStaffType();
		CommandInit.wiiuCommand();
		FreezingEnchantment.registerMCDFreezingEnchantment();
		ThunderingEnchantment.registerMCDThunderingEnchantment();

		Registry.register(Registries.ENCHANTMENT, new Identifier(MCDungeonsToMC.MOD_ID, "thundering"), THUNDERING);
		Registry.register(Registries.ENCHANTMENT, new Identifier(MCDungeonsToMC.MOD_ID, "freezing"), FREEZING);
	}
}