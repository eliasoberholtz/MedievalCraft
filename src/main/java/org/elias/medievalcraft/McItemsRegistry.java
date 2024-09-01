package org.elias.medievalcraft;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class McItemsRegistry {
    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(McMain.MODID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static final Item STEEL_INGOT = register(new Item(new Item.Settings()), "steel_ingot");
    //public static final Item CLAY_CRUCIBLE = register(new Item(new Item.Settings().fireproof()), "clay_crucible");

    public static void init(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(STEEL_INGOT));
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.add(CLAY_CRUCIBLE));
    }
}