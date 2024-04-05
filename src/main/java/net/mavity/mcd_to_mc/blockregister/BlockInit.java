package net.mavity.mcd_to_mc.blockregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {



    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }
    public static void registerMCDBlocks() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered its' blocks.");
    }
}
