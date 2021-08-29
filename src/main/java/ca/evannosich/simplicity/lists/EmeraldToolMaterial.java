package ca.evannosich.simplicity.lists;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
