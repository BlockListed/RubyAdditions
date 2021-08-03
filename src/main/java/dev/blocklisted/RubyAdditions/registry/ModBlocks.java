/*
* This class registers all  blocks in this mod
* */

package dev.blocklisted.RubyAdditions.registry;

import dev.blocklisted.RubyAdditions.RubyAdditions;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    /*
    * Create a block called ruby_block, which has the settings:
    * Preffered tool iron pickaxes and higher
    * Needs preffered tool to drop block
    * Has a slightly higher strength and resistance than diamond blocks
    * Has the same block break sound as amethyst blocks
    * Outputs light level 10 ( same as soul lantern )
    * */
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES,2)
            .requiresTool()
            .strength(6F, 35F)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            .luminance(10)
    );

    public static void registerBlocks() {
        // Register ruby block with identifier `MOD_ID:ruby_block`
        Registry.register(Registry.BLOCK, new Identifier(RubyAdditions.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
