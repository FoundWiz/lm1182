package net.foundwiz.largemeals;

import net.foundwiz.largemeals.common.registry.ModBlocks;
import net.foundwiz.largemeals.common.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LargeMeals.MOD_ID)
public class LargeMeals {
    public static final String MOD_ID = "largemeals";

    public LargeMeals() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(ModItems::buildCreativeTab);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
