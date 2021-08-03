/*
* This class creates all creative mod tabs in this mod
* */

package dev.blocklisted.RubyAdditions;

import dev.blocklisted.RubyAdditions.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModTabs {
    public static final ItemGroup RUBY_ADDITONS_TAB = FabricItemGroupBuilder.create(new Identifier(RubyAdditions.MOD_ID, "rubyadditions_tab"))
            .icon(() -> new ItemStack(ModItems.RUBY))
            .appendItems( stacks -> {
                stacks.add(new ItemStack(ModItems.RUBY));
                stacks.add(new ItemStack(ModItems.RUBY_BLOCK));
                stacks.add(new ItemStack(ModItems.COAL_ENRICHED_DIAMOND));
                stacks.add(new ItemStack(ModItems.MORE_ENRICHED_DIAMOND));
                stacks.add(new ItemStack(ModItems.RUBY_SWORD));
            })
            .build();
}
