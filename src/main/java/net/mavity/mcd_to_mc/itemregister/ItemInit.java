package net.mavity.mcd_to_mc.itemregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseAnchorType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseSwordType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static void addToCombatTab(FabricItemGroupEntries entries) {
        entries.add(ItemInit.SWORD);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, name), item);
    }

    public static final Item SWORD = registerItem("sword_steel",
            new BaseSwordType(ToolMaterials.IRON, 2, -2.4f, new FabricItemSettings().maxDamage(0)));
    public static final Item ANCHOR = registerItem("anchor",
            new BaseAnchorType(ToolMaterials.DIAMOND, 10, -3.4f, new FabricItemSettings().maxDamage(0)));

    public static void registerMCDItems() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.MOD_ID + " has registered its' items.");

        //CREATIVE MODE TAB ADDING
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemInit::addToCombatTab);
    }
}
