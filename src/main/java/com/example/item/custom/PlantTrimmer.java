package com.example.item.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class PlantTrimmer extends Item {
    public PlantTrimmer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()){
            if(world.getBlockState(context.getBlockPos()).isIn(BlockTags.CROPS)){
                world.breakBlock(context.getBlockPos(), true, context.getPlayer());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),item -> {
                    context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND);
                });
            }
        }
        return ActionResult.CONSUME;
    }
}
