package com.starfish_studios.foundation.registry;

import com.starfish_studios.foundation.Foundation;
import com.starfish_studios.foundation.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;

import static net.minecraft.world.level.block.Blocks.litBlockEmission;

public class FoundationBlocks {


    // region LAYERS
    public static final Block OAK_LAYER = register("oak_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS))));
    public static final Block SPRUCE_LAYER = register("spruce_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SPRUCE_PLANKS))));
    public static final Block BIRCH_LAYER = register("birch_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.BIRCH_PLANKS))));
    public static final Block JUNGLE_LAYER = register("jungle_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.JUNGLE_PLANKS))));
    public static final Block ACACIA_LAYER = register("acacia_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.ACACIA_PLANKS))));
    public static final Block DARK_OAK_LAYER = register("dark_oak_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.DARK_OAK_PLANKS))));
    public static final Block CRIMSON_LAYER = register("crimson_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.CRIMSON_PLANKS))));
    public static final Block WARPED_LAYER = register("warped_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WARPED_PLANKS))));
    public static final Block MANGROVE_LAYER = register("mangrove_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.MANGROVE_PLANKS))));
    public static final Block BAMBOO_LAYER = register("bamboo_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.BAMBOO_PLANKS))));
    public static final Block BAMBOO_MOSAIC_LAYER = register("bamboo_mosaic_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.BAMBOO_MOSAIC))));
    public static final Block CHERRY_LAYER = register("cherry_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.CHERRY_PLANKS))));
    public static final Block STONE_LAYER = register("stone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.STONE))));
    public static final Block COBBLESTONE_LAYER = register("cobblestone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.COBBLESTONE))));
    public static final Block MOSSY_COBBLESTONE_LAYER = register("mossy_cobblestone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.MOSSY_COBBLESTONE))));
    public static final Block SMOOTH_STONE_LAYER = register("smooth_stone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SMOOTH_STONE))));
    public static final Block POLISHED_STONE_LAYER = register("polished_stone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SMOOTH_STONE))));
    public static final Block STONE_TILE_LAYER = register("stone_tile_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.STONE_BRICKS))));
    public static final Block STONE_BRICK_LAYER = register("stone_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.STONE_BRICKS))));
    public static final Block MOSSY_STONE_BRICK_LAYER = register("mossy_stone_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.MOSSY_STONE_BRICKS))));
    public static final Block GRANITE_LAYER = register("granite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.GRANITE))));
    public static final Block POLISHED_GRANITE_LAYER = register("polished_granite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_GRANITE))));
    public static final Block DIORITE_LAYER = register("diorite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.DIORITE))));
    public static final Block POLISHED_DIORITE_LAYER = register("polished_diorite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_DIORITE))));
    public static final Block ANDESITE_LAYER = register("andesite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.ANDESITE))));
    public static final Block POLISHED_ANDESITE_LAYER = register("polished_andesite_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_ANDESITE))));
    public static final Block COBBLED_DEEPSLATE_LAYER = register("cobbled_deepslate_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.COBBLED_DEEPSLATE))));
    public static final Block POLISHED_DEEPSLATE_LAYER = register("polished_deepslate_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_DEEPSLATE))));
    public static final Block DEEPSLATE_BRICK_LAYER = register("deepslate_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.DEEPSLATE_BRICKS))));
    public static final Block DEEPSLATE_TILE_LAYER = register("deepslate_tile_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.DEEPSLATE_TILES))));
    public static final Block BRICK_LAYER = register("brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.BRICKS))));
    public static final Block MUD_BRICK_LAYER = register("mud_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.MUD_BRICKS))));
    public static final Block SANDSTONE_LAYER = register("sandstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SANDSTONE))));
    public static final Block SMOOTH_SANDSTONE_LAYER = register("smooth_sandstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SMOOTH_SANDSTONE))));
    public static final Block RED_SANDSTONE_LAYER = register("red_sandstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.RED_SANDSTONE))));
    public static final Block SMOOTH_RED_SANDSTONE_LAYER = register("smooth_red_sandstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.SMOOTH_RED_SANDSTONE))));
    public static final Block PRISMARINE_LAYER = register("prismarine_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.PRISMARINE))));
    public static final Block PRISMARINE_BRICK_LAYER = register("prismarine_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.PRISMARINE_BRICKS))));
    public static final Block DARK_PRISMARINE_LAYER = register("dark_prismarine_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.DARK_PRISMARINE))));
    public static final Block NETHER_BRICK_LAYER = register("nether_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.NETHER_BRICKS))));
    public static final Block RED_NETHER_BRICK_LAYER = register("red_nether_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.RED_NETHER_BRICKS))));
    public static final Block BLACKSTONE_LAYER = register("blackstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.BLACKSTONE))));
    public static final Block POLISHED_BLACKSTONE_LAYER = register("polished_blackstone_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_BLACKSTONE))));
    public static final Block POLISHED_BLACKSTONE_BRICK_LAYER = register("polished_blackstone_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.POLISHED_BLACKSTONE_BRICKS))));
    public static final Block END_STONE_BRICK_LAYER = register("end_stone_brick_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.END_STONE_BRICKS))));
    public static final Block PURPUR_LAYER = register("purpur_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.PURPUR_BLOCK))));
    public static final Block QUARTZ_LAYER = register("quartz_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.QUARTZ_BLOCK))));
    public static final Block CUT_COPPER_LAYER = register("cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.CUT_COPPER))));
    public static final Block EXPOSED_CUT_COPPER_LAYER = register("exposed_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.EXPOSED_CUT_COPPER))));
    public static final Block WEATHERED_CUT_COPPER_LAYER = register("weathered_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WEATHERED_CUT_COPPER))));
    public static final Block OXIDIZED_CUT_COPPER_LAYER = register("oxidized_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.OXIDIZED_CUT_COPPER))));
    public static final Block WAXED_CUT_COPPER_LAYER = register("waxed_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WAXED_CUT_COPPER))));
    public static final Block WAXED_EXPOSED_CUT_COPPER_LAYER = register("waxed_exposed_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WAXED_EXPOSED_CUT_COPPER))));
    public static final Block WAXED_WEATHERED_CUT_COPPER_LAYER = register("waxed_weathered_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WAXED_WEATHERED_CUT_COPPER))));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_LAYER = register("waxed_oxidized_cut_copper_layer", new LayerBlock(FabricBlockSettings.copy((Blocks.WAXED_OXIDIZED_CUT_COPPER))));
    // endregion


    public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy((Blocks.SMOOTH_STONE))));
    public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new StairBlock((Blocks.SMOOTH_STONE.defaultBlockState()), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final Block POLISHED_STONE_SLAB = register("polished_stone_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final Block POLISHED_STONE_COLUMN = register("polished_stone_column", new ColumnBlock(FabricBlockSettings.copy((Blocks.STONE_BRICKS)).noOcclusion()));
    public static final Block STONE_TILES = register("stone_tiles", new Block(FabricBlockSettings.copy((Blocks.STONE_BRICKS))));
    public static final Block STONE_TILE_STAIRS = register("stone_tile_stairs", new StairBlock((Blocks.STONE_BRICKS.defaultBlockState()), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_TILE_SLAB = register("stone_tile_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final Block STONE_FENCE = register("stone_fence", new StoneFenceBlock(FabricBlockSettings.copy((Blocks.STONE_BRICKS)).noOcclusion()));



    // region PALLETS
    public static final Block OAK_PALLET = register("oak_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS)).noOcclusion()));
    public static final Block SPRUCE_PALLET = register("spruce_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.SPRUCE_PLANKS)).noOcclusion()));
    public static final Block BIRCH_PALLET = register("birch_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.BIRCH_PLANKS)).noOcclusion()));
    public static final Block JUNGLE_PALLET = register("jungle_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.JUNGLE_PLANKS)).noOcclusion()));
    public static final Block ACACIA_PALLET = register("acacia_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.ACACIA_PLANKS)).noOcclusion()));
    public static final Block DARK_OAK_PALLET = register("dark_oak_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.DARK_OAK_PLANKS)).noOcclusion()));
    public static final Block MANGROVE_PALLET = register("mangrove_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.MANGROVE_PLANKS)).noOcclusion()));
    public static final Block CHERRY_PALLET = register("cherry_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.CHERRY_PLANKS)).noOcclusion()));
    public static final Block BAMBOO_PALLET = register("bamboo_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.BAMBOO_PLANKS)).noOcclusion()));
    public static final Block CRIMSON_PALLET = register("crimson_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.CRIMSON_PLANKS)).noOcclusion()));
    public static final Block WARPED_PALLET = register("warped_pallet", new PalletBlock(FabricBlockSettings.copy((Blocks.WARPED_PLANKS)).noOcclusion()));
    // endregion

    // region FRAMES
    public static final Block OAK_FRAME = register("oak_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS)).noOcclusion().noCollission()));
    public static final Block SPRUCE_FRAME = register("spruce_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.SPRUCE_PLANKS)).noOcclusion().noCollission()));
    public static final Block BIRCH_FRAME = register("birch_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.BIRCH_PLANKS)).noOcclusion().noCollission()));
    public static final Block JUNGLE_FRAME = register("jungle_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.JUNGLE_PLANKS)).noOcclusion().noCollission()));
    public static final Block ACACIA_FRAME = register("acacia_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.ACACIA_PLANKS)).noOcclusion().noCollission()));
    public static final Block DARK_OAK_FRAME = register("dark_oak_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.DARK_OAK_PLANKS)).noOcclusion().noCollission()));
    public static final Block MANGROVE_FRAME = register("mangrove_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.MANGROVE_PLANKS)).noOcclusion().noCollission()));
    public static final Block CHERRY_FRAME = register("cherry_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.CHERRY_PLANKS)).noOcclusion().noCollission()));
    public static final Block BAMBOO_FRAME = register("bamboo_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.BAMBOO_PLANKS)).noOcclusion().noCollission()));
    public static final Block CRIMSON_FRAME = register("crimson_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.CRIMSON_PLANKS)).noOcclusion().noCollission()));
    public static final Block WARPED_FRAME = register("warped_frame", new FrameBlock(FabricBlockSettings.copy((Blocks.WARPED_PLANKS)).noOcclusion().noCollission()));
    // endregion

    public static final Block BRAZIER = register("brazier", new BrazierBlock(FabricBlockSettings.copy((Blocks.IRON_BLOCK)).lightLevel(litBlockEmission(15)).noOcclusion().pushReaction(PushReaction.DESTROY).strength(1.0F, 1.5F)));

    public static final Block ROOFING = register("roofing", new StairBlock((Blocks.STONE_BRICKS.defaultBlockState()), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));


    public static final Block URN = register("urn", new Block(FabricBlockSettings.copy((Blocks.STONE)).noOcclusion().pushReaction(PushReaction.DESTROY).noOcclusion()));
    public static final Block ROPE = register("rope", new ChainBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS)).forceSolidOn().strength(0.1F).sound(SoundType.WOOL).noOcclusion()));


    // region WOODEN LANTERNS
    public static final Block OAK_LANTERN = register("oak_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block SPRUCE_LANTERN = register("spruce_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.SPRUCE_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block BIRCH_LANTERN = register("birch_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.BIRCH_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block JUNGLE_LANTERN = register("jungle_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.JUNGLE_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block ACACIA_LANTERN = register("acacia_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.ACACIA_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block DARK_OAK_LANTERN = register("dark_oak_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.DARK_OAK_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block MANGROVE_LANTERN = register("mangrove_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.MANGROVE_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block CHERRY_LANTERN = register("cherry_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.CHERRY_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block BAMBOO_LANTERN = register("bamboo_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.BAMBOO_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block CRIMSON_LANTERN = register("crimson_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.CRIMSON_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    public static final Block WARPED_LANTERN = register("warped_lantern", new WoodenLanternBlock(FabricBlockSettings.copy((Blocks.WARPED_PLANKS)).lightLevel((blockStatex) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).strength(0.3F)));
    // endregion

    // region TRIMS
    public static final Block OAK_TRIM = register("oak_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS))));
    public static final Block SPRUCE_TRIM = register("spruce_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.SPRUCE_PLANKS))));
    public static final Block BIRCH_TRIM = register("birch_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.BIRCH_PLANKS))));
    public static final Block JUNGLE_TRIM = register("jungle_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.JUNGLE_PLANKS))));
    public static final Block ACACIA_TRIM = register("acacia_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.ACACIA_PLANKS))));
    public static final Block DARK_OAK_TRIM = register("dark_oak_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.DARK_OAK_PLANKS))));
    public static final Block MANGROVE_TRIM = register("mangrove_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.MANGROVE_PLANKS))));
    public static final Block CHERRY_TRIM = register("cherry_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.CHERRY_PLANKS))));
    public static final Block BAMBOO_TRIM = register("bamboo_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.BAMBOO_PLANKS))));
    public static final Block CRIMSON_TRIM = register("crimson_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.CRIMSON_PLANKS))));
    public static final Block WARPED_TRIM = register("warped_trim", new FacingConnectingBlock(FabricBlockSettings.copy((Blocks.WARPED_PLANKS))));
    // endregion


    public static final Block IRON_FENCE = register("iron_fence", new IronFenceBlock(FabricBlockSettings.copy((Blocks.IRON_BARS)).noOcclusion()));

    public static final Block STONE_MOULDING = register("stone_moulding", new StairBlock((Blocks.STONE_BRICKS.defaultBlockState()), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion()));

    //public static final Block TALL_OAK_DOOR = register("tall_oak_door", new TallDoorBlock(FabricBlockSettings.copy((Blocks.OAK_PLANKS)).noOcclusion(), BlockSetType.OAK));

    // big doors
    public static final Block BIG_DOOR = register("big_door", new BigDoorBlock(FabricBlockSettings.copy((Blocks.OAK_DOOR)).noOcclusion()));


    private static Block register(String id, Block block) {
        System.out.println(Foundation.MOD_ID + ":" + id);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Foundation.MOD_ID, id), block);
    }
}
