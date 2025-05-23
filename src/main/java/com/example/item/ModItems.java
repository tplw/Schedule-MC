package com.example.item;

import com.example.TutorialMod;
import com.example.item.custom.PlantTrimmer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PLANT_TRIMMER = registerItem("plant_trimmer", new PlantTrimmer(new Item.Settings().maxDamage(1)));
    public static final Item COCAINE_PACKAGE = registerItem("cocaine_package", new Item(new Item.Settings()));
    public static final Item OGSUCKER = registerItem("ogsucker", new Item(new Item.Settings()));
    public static final Item COCAINE = registerItem("cocaine", new Item(new Item.Settings().food(ModFoodComponents.COCAINE)));
    public static final Item MARIJUANA_LEAF = registerItem("marijuana_leaf", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItem(){
        TutorialMod.LOGGER.info("Registering Mod Item for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MARIJUANA_LEAF);
            fabricItemGroupEntries.add(COCAINE);
            fabricItemGroupEntries.add(OGSUCKER);
            fabricItemGroupEntries.add(COCAINE_PACKAGE);
        });
    }
}
