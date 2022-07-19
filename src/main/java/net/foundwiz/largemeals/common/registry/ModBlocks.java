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

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LargeMeals.MOD_ID);

    //Feasts
    public static final RegistryObject<Block> OMURICE_BLOCK = BLOCKS.register("omurice_block",
            () -> new OmuriceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL), ModItems.OMURICE, true));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}