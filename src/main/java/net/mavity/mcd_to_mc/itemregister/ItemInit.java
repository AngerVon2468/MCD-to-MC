package net.mavity.mcd_to_mc.itemregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseSwordType;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, name), item);
    }

    public static final Item SWORD = registerItem("sword",
            new BaseSwordType(ToolMaterials.IRON, 14, -2.4f, new FabricItemSettings().maxDamage(1000)));


    public static void registerMCDItems() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.MOD_ID + " has registered its' items??");
    }
}
