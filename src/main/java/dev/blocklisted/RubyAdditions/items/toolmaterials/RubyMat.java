/*
* This class creates the tool material for ruby
* Notes:
*   Base attack damage is 0F, so attack damage only depends on the item constructor.
* */

package dev.blocklisted.RubyAdditions.items.toolmaterials;

import dev.blocklisted.RubyAdditions.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyMat implements ToolMaterial {

    public static final RubyMat INSTANCE = new RubyMat();

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
}
