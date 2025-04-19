package com.example.item;

import com.example.TutorialMod;
import com.example.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DRUGS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "drugs_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COCAINE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.drugs_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COCAINE);
                        entries.add(ModItems.COCAINE_PACKAGE);
                        entries.add(ModItems.OGSUCKER);
                        entries.add(ModItems.MARIJUANA_LEAF);
                        entries.add(ModItems.PLANT_TRIMMER);
                    })
                    .build());
    public static final ItemGroup DRUGS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "drugs_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.COCAINE_PACKAGE_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.drugs_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COCAINE_PACKAGE_BLOCK);
                        entries.add(ModBlocks.SHELF);
                    })
                    .build());


    public static void registerItemGroup(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
