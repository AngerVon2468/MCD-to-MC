package net.mavity.mcd_to_mc.itemregister;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseAnchorType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseHammerType;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseSwordType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static void addToCombatTab(FabricItemGroupEntries entries) {
        entries.add(ItemInit.SWORD);
        entries.add(ItemInit.ANCHOR);
        entries.add(ItemInit.HAMMER);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, name), item);
    }

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MCDungeonsToMC.MOD_ID);

    //REGISTRATE TESTING - NOTE TO SELF, THIS DOESN'T WORK & CRASHES IF YOU TRY TO HAVE IT IN INVENTORY
    public static final ItemEntry<Item> something =
            REGISTRATE.item("something", Item::new)
                    .register();
    //SWORD
    public static final Item SWORD = registerItem("sword_steel",
            new BaseSwordType(ToolMaterials.IRON, 2, -2.4f, new FabricItemSettings().maxDamage(0)));
    //ANCHOR
    public static final Item ANCHOR = registerItem("anchor",
            new BaseAnchorType(ToolMaterials.DIAMOND, 10, -3.4f, new FabricItemSettings().maxDamage(0)));
    //HAMMER
    public static final Item HAMMER = registerItem("hammer",
            new BaseHammerType(ToolMaterials.DIAMOND, 6, -2.8f, new FabricItemSettings().maxDamage(0)));
    //ROUGH IRON
    public static final Item ROUGH_IRON = registerItem("rough_iron", new SequencedAssemblyItem(new FabricItemSettings().maxDamage(0).maxCount(64)));
    public static final Item ROUGH_IRON_INGOT = registerItem("rough_iron_ingot", new Item(new FabricItemSettings().maxDamage(0).maxCount(64)));
    //LOGGER & CREATIVE MODE TABS
    public static void registerMCDItems() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered its' items.");

        //CREATIVE MODE TAB ADDING
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemInit::addToCombatTab);
    }
}
