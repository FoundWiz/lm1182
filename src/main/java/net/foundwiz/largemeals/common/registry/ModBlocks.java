package net.foundwiz.largemeals.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.foundwiz.largemeals.common.block.OmuriceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.foundwiz.largemeals.LargeMeals;
import vectorwing.farmersdelight.common.block.PieBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LargeMeals.MOD_ID);

    //Feasts
    public static final RegistryObject<Block> OMURICE_BLOCK = BLOCKS.register("omurice_block",
            () -> new OmuriceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), ModItems.OMURICE, true));

    public static final RegistryObject<Block> MUSHROOM_POT_PIE_BLOCK = BLOCKS.register("mushroom_pot_pie",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), ModItems.MUSHROOM_POT_PIE));



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}