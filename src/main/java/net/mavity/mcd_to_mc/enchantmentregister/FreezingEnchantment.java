package net.mavity.mcd_to_mc.enchantmentregister;

import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.ItemTags;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseStaffType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class FreezingEnchantment extends Enchantment {
    public FreezingEnchantment() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isIn(ItemTags.APPLY_ENCHANT_TAG) || stack.getItem() instanceof CrossbowItem || stack.getItem() instanceof BowItem || stack.getItem() instanceof BaseStaffType;
    }

    @Override
    public int getMinPower(int level) {
        return MCDungeonsToMC.CONFIG.getConfig().minMCDEnchantLevel;
    }

    @Override
    public int getMaxLevel() {
        return MCDungeonsToMC.CONFIG.getConfig().maxMCDEnchantLevel;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return MCDungeonsToMC.CONFIG.getConfig().doMCDEnchantments;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return MCDungeonsToMC.CONFIG.getConfig().doMCDEnchantments;
    }

    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 10 * level, 2));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 10 * level, 2));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 10 * level, 2));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 10 * level, 2));
        }

        super.onTargetDamaged(user, target, level);
    }
    public static void registerMCDFreezingEnchantment() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered an enchantment called freezing.");
    }
}