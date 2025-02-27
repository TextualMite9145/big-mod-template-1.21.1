package net.alex.bigmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent PINK_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 4), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent REFINED_PINK_GARNET = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 400, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 400, 4), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 400, 4), 1.0F)
            .alwaysEdible()
            .build();


}
