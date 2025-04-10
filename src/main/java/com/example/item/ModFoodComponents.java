package com.example.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static FoodComponent COCAINE = new FoodComponent.Builder().nutrition(10).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, Integer.MAX_VALUE),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, Integer.MAX_VALUE, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5000), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10 ), 0.2f).build();

}
