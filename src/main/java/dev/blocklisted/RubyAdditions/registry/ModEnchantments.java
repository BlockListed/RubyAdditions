/*
* Register all Enchantments in this mod
* */

package dev.blocklisted.RubyAdditions.registry;

import dev.blocklisted.RubyAdditions.RubyAdditions;
import dev.blocklisted.RubyAdditions.enchantments.ExplodeAttack;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    // Create ExplodeAttack enchantment

    public static final Enchantment EXPLODE_ATTACK = new ExplodeAttack();

    public static void registerEnchantments() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(RubyAdditions.MOD_ID, "explode_attack"), EXPLODE_ATTACK);
    }
}
