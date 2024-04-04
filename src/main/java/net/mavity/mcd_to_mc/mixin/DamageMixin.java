package net.mavity.mcd_to_mc.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.mavity.mcd_to_mc.itemregister.ItemTags;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DamageEnchantment.class)
public class DamageMixin {
    // the newer and clean approach, which is a bit more compatible with other mods (uses MixinExtras)
    @ModifyReturnValue(method = "isAcceptableItem", at = @At(value = "RETURN"))
    private boolean changeDamageConditionButInClean(boolean original, ItemStack stack) {
        return original || stack.isIn(ItemTags.APPLY_ENCHANT_TAG);
    }
}