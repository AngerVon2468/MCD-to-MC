package net.mavity.mcd_to_mc.blockregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.blockregister.blocktypes.HalfSlabType;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {

    public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
            new HalfSlabType(FabricBlockSettings.create().nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCDungeonsToMC.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }
    public static void registerMCDBlocks() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered its' blocks.");
    }
}
