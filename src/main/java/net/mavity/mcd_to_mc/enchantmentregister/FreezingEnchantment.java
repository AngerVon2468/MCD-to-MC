package net.mavity.mcd_to_mc.enchantmentregister;

import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FreezingEnchantment extends Enchantment {
    public FreezingEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
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