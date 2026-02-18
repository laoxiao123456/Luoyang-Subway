package com.luoyang.item;

import com.luoyang.subway.LuoyangSubway;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Moditems {

    //这是注册的物品，以后方块多的话建议分类，例：blocks、nbt
    public static  final Item PLATFORM_DOOR01 = registerItem("platform_door01", new Item(new Item.Settings()));
    public static  final Item PLATFORM_DOOR02 = registerItem("platform_door02", new Item(new Item.Settings()));
    public static  final Item PLATFORM_DOOR03 = registerItem("platform_door03", new Item(new Item.Settings()));

    //这是整合后的物品注册方法
    public static  Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(id)), item);
    }

    //这个也是
    public  static  Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LuoyangSubway.MOD_ID, id), item);
    }

    //这个是原版的物品注册（fabric）
    public static Item register(String id, Item item) {
        return register(new Identifier(LuoyangSubway.MOD_ID, id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }
    //这是辅助注册方法
    public static void registerItems() {

    }

}

