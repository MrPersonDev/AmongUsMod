package mrperson.amongus.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KnifeToolMaterial implements ToolMaterial {
    public static final KnifeToolMaterial INSTANCE = new KnifeToolMaterial();

    @Override
    public int getDurability() {
        return 2317;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1;
    }

    @Override
    public float getAttackDamage() {
        return 26;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.AMONG_US_INGOT);
    }


}
