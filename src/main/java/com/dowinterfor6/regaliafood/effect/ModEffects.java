package com.dowinterfor6.regaliafood.effect;

import com.dowinterfor6.regaliafood.RegaliaFood;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
	public static final DeferredRegister<MobEffect> MOB_EFFECTS
		= DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RegaliaFood.MODID);

	public static final RegistryObject<MobEffect> DRINK = MOB_EFFECTS.register("drink",
			() -> new DrinkEffect(MobEffectCategory.BENEFICIAL, 3124687));
	
	public static final RegistryObject<MobEffect> MEAL = MOB_EFFECTS.register("meal",
			() -> new MealEffect(MobEffectCategory.BENEFICIAL, 3124687));
	
	public static final RegistryObject<MobEffect> SIDE = MOB_EFFECTS.register("side",
			() -> new SideEffect(MobEffectCategory.BENEFICIAL, 3124687));
	
	public static final RegistryObject<MobEffect> SNACK = MOB_EFFECTS.register("snack",
			() -> new MealEffect(MobEffectCategory.BENEFICIAL, 3124687));
	
	public static void register(IEventBus eventBus) {
		MOB_EFFECTS.register(eventBus);
	}
}
