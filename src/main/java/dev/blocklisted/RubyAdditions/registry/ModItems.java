/*
 * This class register all items in the mod
 * */

package dev.blocklisted.RubyAdditions.registry;

import dev.blocklisted.RubyAdditions.RubyAdditions;
import dev.blocklisted.RubyAdditions.items.toolmaterials.RubyMat;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items

    // Create ruby, which is in category Miscellaneous
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));
    // Create Coal Enriched Diamond, which is in category Miscellaneous
    public static final Item COAL_ENRICHED_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));
    // Create Super Enriched Diamond, which is in category Miscellaneous
    public static final Item MORE_ENRICHED_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MISC));
    // Create Ruby Sword, which is in category Combat
    public static final ToolItem RUBY_SWORD = new SwordItem(RubyMat.INSTANCE, 12, 2F, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC));

    // BlockItems

    // Create Item for block `MOD_ID:ruby_block`, which is in category Building Blocks
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems() {
        // Items

        // Register item with identifier `MOD_ID:ruby`
        Registry.register(Registry.ITEM, new Identifier(RubyAdditions.MOD_ID, "ruby"), RUBY);
        // Register item with identifier `MOD_ID:coal_enriched_diamond`
        Registry.register(Registry.ITEM, new Identifier(RubyAdditions.MOD_ID, "coal_enriched_diamond"), COAL_ENRICHED_DIAMOND);
        // Register item with identifier `MOD_ID:more_enriched_diamond`
        Registry.register(Registry.ITEM, new Identifier(RubyAdditions.MOD_ID, "more_enriched_diamond"), MORE_ENRICHED_DIAMOND);
        // Register item with identifier `MOD_ID:ruby_sword`
        Registry.register(Registry.ITEM, new Identifier(RubyAdditions.MOD_ID, "ruby_sword"), RUBY_SWORD);

        // BlockItems

        // Register BlockItem with identifier `MOD_ID:ruby_block`
        Registry.register(Registry.ITEM, new Identifier(RubyAdditions.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
