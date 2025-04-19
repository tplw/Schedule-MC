package com.example.datagen;

import com.example.block.ModBlocks;
import com.example.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COCAINE_PACKAGE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHELF);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COCAINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE_PACKAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARIJUANA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.OGSUCKER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLANT_TRIMMER, Models.GENERATED);

    }
}
