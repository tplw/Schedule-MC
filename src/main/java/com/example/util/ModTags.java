package com.example.util;

import com.example.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTage(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
        }

    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS =
                createTage("transformable_items");
    }
        private static TagKey<Item> createTage(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name));

    }
}
