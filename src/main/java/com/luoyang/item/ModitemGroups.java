package com.luoyang.item;

import com.luoyang.subway.LuoyangSubway;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModitemGroups {

    public static final RegistryKey<ItemGroup> STATION_BLOCKS = register("station_blocks");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(LuoyangSubway.MOD_ID));
    }     //注册方法

  public static final ItemGroup STATION_SIGNS = Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(LuoyangSubway.MOD_ID, "station_signs"),
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.station_signs"))
                        .icon(() -> new ItemStack(Moditems.SIGN_3E))
                        .entries((displayContext, entries) -> {
                            entries.add(Moditems.SIGN_3E);
                        }).build());      //车站标志


    public static void registerGroups(){
        Registry.register(Registries.ITEM_GROUP,STATION_BLOCKS, ItemGroup.create(ItemGroup.Row.TOP,7)
                .displayName(Text.translatable("itemGroup.station_blocks"))
                .icon(() -> new ItemStack(Moditems.RAILING_01))
                .entries((displayContext, entries) -> {
                    entries.add(Moditems.PLATFORM_DOOR01);
                    entries.add(Moditems.PLATFORM_DOOR02);
                    entries.add(Moditems.PLATFORM_DOOR03);
                    entries.add(Moditems.PLATFORM_DOOR_GLASS);
                    entries.add(Moditems.RAILING_01);
                }).build());             //车站方块
   }

}