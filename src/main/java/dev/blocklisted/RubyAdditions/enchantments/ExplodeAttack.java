package dev.blocklisted.RubyAdditions.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class ExplodeAttack extends Enchantment {
    public ExplodeAttack() {
        super(
                Rarity.VERY_RARE,
                EnchantmentTarget.WEAPON,
                new EquipmentSlot[]{
                    EquipmentSlot.MAINHAND
                }
        );
    }

    @Override
    public int getMinLevel() {
        return 15;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            World world = user.world;
            // Equation, which converts 1 to 3, 2 to 5 and 3 to 8. This is to create a dynamic power level for each enchantment level.
            // (Got this from a quadratic fit at wolfram alpha)
            float powerlevel = (float) (0.5*Math.pow(level, 2) + 0.5*level + 2);
            world.createExplosion(target, target.getX(), target.getY(), target.getZ(), powerlevel, Explosion.DestructionType.BREAK);
        }
    }
}
