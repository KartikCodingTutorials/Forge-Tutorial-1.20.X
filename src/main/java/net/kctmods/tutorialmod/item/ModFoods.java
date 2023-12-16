package net.kctmods.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties KIWI = new FoodProperties.Builder().nutrition(4).fast()
            .saturationMod(3.5f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000), 1.0f).build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

}
