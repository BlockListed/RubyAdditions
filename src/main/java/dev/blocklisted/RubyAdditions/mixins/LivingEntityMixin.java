package dev.blocklisted.RubyAdditions.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    @Shadow
    @Final
    private DefaultedList<ItemStack> equippedArmor;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method="tick()V")
    public void tick(CallbackInfo info) {
        if(isOnFire()) {
            int armorcount = 0;

            // Get amount of tnt on armorslots
            for (int i = 0; i > 4; i++) {
                if (equippedArmor.get(i).getItem() == Items.TNT) {
                    armorcount++;
                }
            }

            if (armorcount > 0) {
                // Make player stop burning
                extinguish();
            }

            // Generate explosion strength using periodic fit from wolfram alpha
            float explode_strength = (float) (-2.05682*Math.sin(armorcount) - 2.31*Math.cos(armorcount) + 4.95616);

            // Create explosion at player
            world.createExplosion(this, this.getX(), this.getY(), this.getZ(), explode_strength, Explosion.DestructionType.BREAK);
        }
    }
}
