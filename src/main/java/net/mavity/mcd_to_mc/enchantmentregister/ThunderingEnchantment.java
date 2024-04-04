package net.mavity.mcd_to_mc.enchantmentregister;


import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.ItemTags;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import java.util.Random;


public class ThunderingEnchantment extends Enchantment {
    public ThunderingEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isIn(ItemTags.APPLY_ENCHANT_TAG);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return MCDungeonsToMC.CONFIG.getConfig().doMCDEnchantments;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return MCDungeonsToMC.CONFIG.getConfig().doMCDEnchantments;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        Random randombase = new Random();
        int random = randombase.nextInt(25);
        int requirement = level * 5;
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        } else {
            super.onTargetDamaged(user, target, level);
        }
    }
    public static void registerMCDThunderingEnchantment() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered an enchantment called thundering.");
    }
}
