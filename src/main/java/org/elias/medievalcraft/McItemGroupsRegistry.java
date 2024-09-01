package org.elias.medievalcraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class McItemGroupsRegistry {

    public static final RegistryKey<ItemGroup> MC_ITEMS_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(McMain.MODID, "items_mc"));
    public static final ItemGroup MC_ITEMS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(McItemsRegistry.STEEL_INGOT))
            .displayName(Text.translatable("itemGroup.medievalcraft.mc_items"))
            .build();

    public static void register(){
        Registry.register(Registries.ITEM_GROUP, MC_ITEMS_GROUP_KEY, MC_ITEMS_GROUP);
        ItemGroupEvents.modifyEntriesEvent(MC_ITEMS_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(McItemsRegistry.STEEL_INGOT);
        });
    }
}
