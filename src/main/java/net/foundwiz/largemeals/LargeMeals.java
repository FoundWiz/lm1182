package net.foundwiz.largemeals;

import net.foundwiz.largemeals.common.registry.ModCreativeTab;
import net.minecraft.world.level.block.Blocks;
import net.foundwiz.largemeals.common.registry.ModBlocks;
import net.foundwiz.largemeals.common.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(LargeMeals.MOD_ID)
public class LargeMeals {
    public static final String MOD_ID = "largemeals";

    private static final Logger LOGGER = LogUtils.getLogger();

    public LargeMeals()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
