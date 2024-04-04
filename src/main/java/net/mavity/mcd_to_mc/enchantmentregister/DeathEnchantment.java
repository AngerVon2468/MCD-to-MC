package net.mavity.mcd_to_mc.enchantmentregister;

import net.mavity.mcd_to_mc.MCDungeonsToMC;
import net.mavity.mcd_to_mc.itemregister.ItemTags;
import net.mavity.mcd_to_mc.itemregister.itemtypes.BaseStaffType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class DeathEnchantment extends Enchantment {
    public DeathEnchantment() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BOW, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isIn(ItemTags.APPLY_ENCHANT_TAG) || stack.getItem() instanceof CrossbowItem || stack.getItem() instanceof BaseStaffType;
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return MCDungeonsToMC.CONFIG.getConfig().doOptionalEnchantmentsLootTables;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return MCDungeonsToMC.CONFIG.getConfig().doOptionalEnchantmentsLootTables;
    }

    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 10 * level, 2 * level));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 10 * level, 2 * level));
        }
        Random randombase = new Random();
        int random = randombase.nextInt(25);
        int requirement = level * 5;
        if (level >= 5) {
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
            /*BlockPos blockPos = target.getBlockPos();*/
            if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
                assert lightningEntity != null;
                lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
                target.getWorld().spawnEntity(lightningEntity);
            }
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
        /*BlockPos blockPos = target.getBlockPos();*/
        if (random < requirement/* && target.getWorld().isSkyVisible(blockPos)*/) {
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(target.getX(), target.getY(), target.getZ());
            target.getWorld().spawnEntity(lightningEntity);
        }
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
    public static void registerMCDFreezingEnchantment() {
        MCDungeonsToMC.LOGGER.info(MCDungeonsToMC.NAME + " has registered an enchantment called freezing.");
    }
}