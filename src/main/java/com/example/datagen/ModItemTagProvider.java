package com.example.datagen;

import com.example.item.ModItems;
import com.example.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                    .add(ModItems.COCAINE)
                    .add(ModItems.COCAINE_PACKAGE)
                    .add(ModItems.MARIJUANA_LEAF)
                    .add(ModItems.OGSUCKER)
                    .add(ModItems.PLANT_TRIMMER);

    }
}
