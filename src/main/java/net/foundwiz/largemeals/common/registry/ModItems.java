package net.foundwiz.largemeals.common.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BlockItem;
import net.foundwiz.largemeals.common.FoodValues;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.foundwiz.largemeals.LargeMeals;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeMeals.MOD_ID);

    //Soups and Stews
    public static final RegistryObject<Item> PUFFERFISH_BROTH = ITEMS.register("pufferfish_broth",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.PUFFERFISH_BROTH).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> MILK_CHICKEN = ITEMS.register("milk_chicken",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.MILK_CHICKEN).craftRemainder(Items.BOWL).stacksTo(16), true));

    //Plated Meals
    public static final RegistryObject<Item> COD_DELUXE = ITEMS.register("cod_deluxe",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.COD_DELUXE).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> COD_SURPRISE = ITEMS.register("cod_surprise",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.COD_SURPRISE).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> HEARTY_LUNCH = ITEMS.register("hearty_lunch",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.HEARTY_LUNCH).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> MUSHROOM_OMELETTE = ITEMS.register("mushroom_omelette",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.MUSHROOM_OMELETTE).craftRemainder(Items.BOWL).stacksTo(16), true));

    //Feasts
    public static final RegistryObject<Item> OMURICE_BLOCK = ITEMS.register("omurice_block",
            () -> new BlockItem(ModBlocks.OMURICE_BLOCK.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OMURICE = ITEMS.register("omurice",
            () -> new ConsumableItem(new Item.Properties().food(FoodValues.OMURICE).craftRemainder(Items.BOWL).stacksTo(16), true));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get()) {
            event.accept(ModItems.PUFFERFISH_BROTH);
            event.accept(ModItems.MILK_CHICKEN);
            event.accept(ModItems.COD_DELUXE);
            event.accept(ModItems.COD_SURPRISE);
            event.accept(ModItems.HEARTY_LUNCH);
            event.accept(ModItems.MUSHROOM_OMELETTE);
            event.accept(ModItems.OMURICE_BLOCK);
            event.accept(ModItems.OMURICE);
        }
    }
}
