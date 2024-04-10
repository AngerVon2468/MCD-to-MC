package net.mavity.mcd_to_mc.itemregister;

import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final TagKey<Item> APPLY_ENCHANT_TAG = TagKey.of(RegistryKeys.ITEM, new Identifier(MCDungeonsToMC.MOD_ID, "applyenchanttag"));
}
