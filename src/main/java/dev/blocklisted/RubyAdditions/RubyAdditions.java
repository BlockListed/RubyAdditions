package dev.blocklisted.RubyAdditions;

import dev.blocklisted.RubyAdditions.registry.ModBlocks;
import dev.blocklisted.RubyAdditions.registry.ModItems;
import dev.blocklisted.RubyAdditions.registry.ModEnchantments;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;

public class RubyAdditions implements ModInitializer {

    public static final String MOD_ID = "rubyadditions";

    // Creative mode tabs
    public static final ItemGroup RUBY_ADDITIONS_TAB = ModTabs.RUBY_ADDITONS_TAB;

    @Override
    public void onInitialize() {
        // Register non special items and blocks
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModEnchantments.registerEnchantments();
    }
}
