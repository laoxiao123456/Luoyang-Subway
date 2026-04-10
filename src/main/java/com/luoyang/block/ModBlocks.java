package com.luoyang.block;

import com.luoyang.subway.LuoyangSubway;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PLATFORM_DOOR01 = register("platform_door01", new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block PLATFORM_DOOR02 = register("platform_door02", new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Block PLATFORM_DOOR03 = register("platform_door03", new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK)));

    public static Block register(String id, Block block) {
        RegisterBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(LuoyangSubway.MOD_ID, id), block);
    }

    public static void RegisterBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(LuoyangSubway.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

}
