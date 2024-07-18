package net.foundwiz.largemeals.common.registry;

import net.foundwiz.largemeals.LargeMeals;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

@Mod.EventBusSubscriber(modid = LargeMeals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {

   @SubscribeEvent
   public static void buildContents( BuildCreativeModeTabContentsEvent event ) {
      if ( event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get() ) {
         event.accept(ModItems.PUFFERFISH_BROTH);
         event.accept(ModItems.MILK_CHICKEN);
         event.accept(ModItems.COD_DELUXE);
         event.accept(ModItems.COD_SURPRISE);
         event.accept(ModItems.HEARTY_LUNCH);
         event.accept(ModItems.MUSHROOM_OMELETTE);
         event.accept(ModItems.OMURICE_BLOCK);
         event.accept(ModItems.OMURICE);
         event.accept(ModItems.MUSHROOM_POT_PIE_BLOCK);
         event.accept(ModItems.MUSHROOM_POT_PIE);
         event.accept(ModItems.POTATO_SOUP);
         event.accept(ModItems.RED_SOUP);
         event.accept(ModItems.SWEET_BERRY_CUSTARD);

      }
   }
}
