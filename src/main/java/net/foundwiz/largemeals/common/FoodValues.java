package net.foundwiz.largemeals.common;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import vectorwing.farmersdelight.common.registry.ModEffects;
import net.minecraft.world.food.FoodProperties;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class FoodValues {
    //Bowl Foods
    public static final FoodProperties PUFFERFISH_BROTH = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties MILK_CHICKEN = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();

    //Plated Foods
    public static final FoodProperties COD_DELUXE = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties COD_SURPRISE = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties HEARTY_LUNCH = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties MUSHROOM_OMELETTE = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).build();

    //Feast Portions
    public static final FoodProperties OMURICE = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
}