package org.elias.medievalcraft;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.elias.medievalcraft.blocks.ClayCrucible;

public class McBlocksRegistry {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(McMain.MODID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    //public static final Block CLAY_CRUCIBLE = register(new Block(AbstractBlock.Settings.create()), "clay_crucible", true);
    public static final Block CRUCIBLE_WIDE = register(new Block(AbstractBlock.Settings.create()), "crucible_wide", true);
    public static final Block CRUCIBLE_CLAY = register(new ClayCrucible(AbstractBlock.Settings.create()), "crucible_clay", true);

    public static void init(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.add(CRUCIBLE_WIDE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.add(CRUCIBLE_CLAY));
    }
}
