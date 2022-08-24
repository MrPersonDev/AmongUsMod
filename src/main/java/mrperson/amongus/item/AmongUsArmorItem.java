package mrperson.amongus.item;

import mrperson.amongus.effect.EffectRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class AmongUsArmorItem extends ArmorItem {
    private boolean lastHasFullArmor = false;

    public AmongUsArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;

                if (hasFullArmor(ItemRegistry.AMONG_US_ARMOR_MATERIAL, player)) {
                    if (!lastHasFullArmor) {
                        player.addStatusEffect(new StatusEffectInstance(EffectRegistry.SUS, Integer.MAX_VALUE, 1));
                        lastHasFullArmor = true;
                    }
                }
                else {
                    if (lastHasFullArmor) {
                        player.removeStatusEffect(EffectRegistry.SUS);
                    }
                    lastHasFullArmor = false;
                }
            }
        }
    }

    private boolean hasFullArmor(ArmorMaterial material, PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);
        if (boots.isEmpty() || leggings.isEmpty() || chestplate.isEmpty() || helmet.isEmpty())
            return false;
        if (chestplate.getItem() == Items.ELYTRA)
            return false;

        ArmorMaterial bootsMaterial = ((ArmorItem) boots.getItem()).getMaterial();
        ArmorMaterial leggingsMaterial = ((ArmorItem) leggings.getItem()).getMaterial();
        ArmorMaterial chestplateMaterial = ((ArmorItem) chestplate.getItem()).getMaterial();
        ArmorMaterial helmetMaterial = ((ArmorItem) helmet.getItem()).getMaterial();
        if (bootsMaterial != material || leggingsMaterial != material || chestplateMaterial != material
                || helmetMaterial != material)
            return false;

        return true;
    }
}
