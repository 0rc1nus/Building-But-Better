package com.starfish_studios.foundation.registry;

import com.starfish_studios.foundation.Foundation;
import com.starfish_studios.foundation.item.DescriptionBlockItem;
import com.starfish_studios.foundation.item.TallDoorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class FoundationItems {

    public static final Item FOUNDATION = register("foundation", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON).fireproof()));
    public static final Item HAMMER = register("hammer", new Item(new FabricItemSettings().maxCount(1).durability(256)));


    public static final Item PLASTER = register("plaster", new BlockItem(FoundationBlocks.PLASTER, new FabricItemSettings()));
    public static final Item OAK_WALL = register("oak_wall", new BlockItem(FoundationBlocks.OAK_WALL, new FabricItemSettings()));


    public static final Item STONE_URN = register("stone_urn", new DescriptionBlockItem(FoundationBlocks.STONE_URN, new FabricItemSettings()));
    public static final Item BLACKSTONE_URN = register("blackstone_urn", new DescriptionBlockItem(FoundationBlocks.BLACKSTONE_URN, new FabricItemSettings()));
    public static final Item DEEPSLATE_URN = register("deepslate_urn", new DescriptionBlockItem(FoundationBlocks.DEEPSLATE_URN, new FabricItemSettings()));
    public static final Item NETHER_BRICK_URN = register("nether_brick_urn", new DescriptionBlockItem(FoundationBlocks.NETHER_BRICK_URN, new FabricItemSettings()));
    public static final Item SANDSTONE_URN = register("sandstone_urn", new DescriptionBlockItem(FoundationBlocks.SANDSTONE_URN, new FabricItemSettings()));
    public static final Item RED_SANDSTONE_URN = register("red_sandstone_urn", new DescriptionBlockItem(FoundationBlocks.RED_SANDSTONE_URN, new FabricItemSettings()));
    public static final Item QUARTZ_URN = register("quartz_urn", new DescriptionBlockItem(FoundationBlocks.QUARTZ_URN, new FabricItemSettings()));


    public static final Item STONE_MOULDING = register("stone_moulding", new BlockItem(FoundationBlocks.STONE_MOULDING, new FabricItemSettings()));
    public static final Item BLACKSTONE_MOULDING = register("blackstone_moulding", new BlockItem(FoundationBlocks.BLACKSTONE_MOULDING, new FabricItemSettings()));
    public static final Item DEEPSLATE_MOULDING = register("deepslate_moulding", new BlockItem(FoundationBlocks.DEEPSLATE_MOULDING, new FabricItemSettings()));
    public static final Item NETHER_BRICK_MOULDING = register("nether_brick_moulding", new BlockItem(FoundationBlocks.NETHER_BRICK_MOULDING, new FabricItemSettings()));
    public static final Item SANDSTONE_MOULDING = register("sandstone_moulding", new BlockItem(FoundationBlocks.SANDSTONE_MOULDING, new FabricItemSettings()));
    public static final Item RED_SANDSTONE_MOULDING = register("red_sandstone_moulding", new BlockItem(FoundationBlocks.RED_SANDSTONE_MOULDING, new FabricItemSettings()));
    public static final Item QUARTZ_MOULDING = register("quartz_moulding", new BlockItem(FoundationBlocks.QUARTZ_MOULDING, new FabricItemSettings()));


    public static final Item STONE_COLUMN = register("stone_column", new DescriptionBlockItem(FoundationBlocks.STONE_COLUMN, new FabricItemSettings()));
    public static final Item DEEPSLATE_COLUMN = register("deepslate_column", new DescriptionBlockItem(FoundationBlocks.DEEPSLATE_COLUMN, new FabricItemSettings()));
    public static final Item SANDSTONE_COLUMN = register("sandstone_column", new DescriptionBlockItem(FoundationBlocks.SANDSTONE_COLUMN, new FabricItemSettings()));
    public static final Item RED_SANDSTONE_COLUMN = register("red_sandstone_column", new DescriptionBlockItem(FoundationBlocks.RED_SANDSTONE_COLUMN, new FabricItemSettings()));
    public static final Item NETHER_BRICK_COLUMN = register("nether_brick_column", new DescriptionBlockItem(FoundationBlocks.NETHER_BRICK_COLUMN, new FabricItemSettings()));
    public static final Item BLACKSTONE_COLUMN = register("blackstone_column", new DescriptionBlockItem(FoundationBlocks.BLACKSTONE_COLUMN, new FabricItemSettings()));
    public static final Item QUARTZ_COLUMN = register("quartz_column", new DescriptionBlockItem(FoundationBlocks.QUARTZ_COLUMN, new FabricItemSettings()));



    public static final Item STONE_FENCE = register("stone_fence", new DescriptionBlockItem(FoundationBlocks.STONE_FENCE, new FabricItemSettings()));
    public static final Item BLACKSTONE_FENCE = register("blackstone_fence", new DescriptionBlockItem(FoundationBlocks.BLACKSTONE_FENCE, new FabricItemSettings()));
    public static final Item DEEPSLATE_FENCE = register("deepslate_fence", new DescriptionBlockItem(FoundationBlocks.DEEPSLATE_FENCE, new FabricItemSettings()));
    public static final Item NETHER_BRICK_FENCE = register("nether_brick_fence", new DescriptionBlockItem(FoundationBlocks.NETHER_BRICK_FENCE, new FabricItemSettings()));
    public static final Item SANDSTONE_FENCE = register("sandstone_fence", new DescriptionBlockItem(FoundationBlocks.SANDSTONE_FENCE, new FabricItemSettings()));
    public static final Item RED_SANDSTONE_FENCE = register("red_sandstone_fence", new DescriptionBlockItem(FoundationBlocks.RED_SANDSTONE_FENCE, new FabricItemSettings()));
    public static final Item QUARTZ_FENCE = register("quartz_fence", new DescriptionBlockItem(FoundationBlocks.QUARTZ_FENCE, new FabricItemSettings()));



    // region BEAMS
    public static final Item OAK_BEAM = register("oak_beam", new BlockItem(FoundationBlocks.OAK_BEAM, new FabricItemSettings()));
    public static final Item OAK_BEAM_STAIRS = register("oak_beam_stairs", new BlockItem(FoundationBlocks.OAK_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item OAK_BEAM_SLAB = register("oak_beam_slab", new BlockItem(FoundationBlocks.OAK_BEAM_SLAB, new FabricItemSettings()));
    public static final Item SPRUCE_BEAM = register("spruce_beam", new BlockItem(FoundationBlocks.SPRUCE_BEAM, new FabricItemSettings()));
    public static final Item SPRUCE_BEAM_STAIRS = register("spruce_beam_stairs", new BlockItem(FoundationBlocks.SPRUCE_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item SPRUCE_BEAM_SLAB = register("spruce_beam_slab", new BlockItem(FoundationBlocks.SPRUCE_BEAM_SLAB, new FabricItemSettings()));
    public static final Item BIRCH_BEAM = register("birch_beam", new BlockItem(FoundationBlocks.BIRCH_BEAM, new FabricItemSettings()));
    public static final Item BIRCH_BEAM_STAIRS = register("birch_beam_stairs", new BlockItem(FoundationBlocks.BIRCH_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item BIRCH_BEAM_SLAB = register("birch_beam_slab", new BlockItem(FoundationBlocks.BIRCH_BEAM_SLAB, new FabricItemSettings()));
    public static final Item JUNGLE_BEAM = register("jungle_beam", new BlockItem(FoundationBlocks.JUNGLE_BEAM, new FabricItemSettings()));
    public static final Item JUNGLE_BEAM_STAIRS = register("jungle_beam_stairs", new BlockItem(FoundationBlocks.JUNGLE_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item JUNGLE_BEAM_SLAB = register("jungle_beam_slab", new BlockItem(FoundationBlocks.JUNGLE_BEAM_SLAB, new FabricItemSettings()));
    public static final Item ACACIA_BEAM = register("acacia_beam", new BlockItem(FoundationBlocks.ACACIA_BEAM, new FabricItemSettings()));
    public static final Item ACACIA_BEAM_STAIRS = register("acacia_beam_stairs", new BlockItem(FoundationBlocks.ACACIA_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item ACACIA_BEAM_SLAB = register("acacia_beam_slab", new BlockItem(FoundationBlocks.ACACIA_BEAM_SLAB, new FabricItemSettings()));
    public static final Item DARK_OAK_BEAM = register("dark_oak_beam", new BlockItem(FoundationBlocks.DARK_OAK_BEAM, new FabricItemSettings()));
    public static final Item DARK_OAK_BEAM_STAIRS = register("dark_oak_beam_stairs", new BlockItem(FoundationBlocks.DARK_OAK_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item DARK_OAK_BEAM_SLAB = register("dark_oak_beam_slab", new BlockItem(FoundationBlocks.DARK_OAK_BEAM_SLAB, new FabricItemSettings()));
    public static final Item CRIMSON_BEAM = register("crimson_beam", new BlockItem(FoundationBlocks.CRIMSON_BEAM, new FabricItemSettings()));
    public static final Item CRIMSON_BEAM_STAIRS = register("crimson_beam_stairs", new BlockItem(FoundationBlocks.CRIMSON_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item CRIMSON_BEAM_SLAB = register("crimson_beam_slab", new BlockItem(FoundationBlocks.CRIMSON_BEAM_SLAB, new FabricItemSettings()));
    public static final Item WARPED_BEAM = register("warped_beam", new BlockItem(FoundationBlocks.WARPED_BEAM, new FabricItemSettings()));
    public static final Item WARPED_BEAM_STAIRS = register("warped_beam_stairs", new BlockItem(FoundationBlocks.WARPED_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item WARPED_BEAM_SLAB = register("warped_beam_slab", new BlockItem(FoundationBlocks.WARPED_BEAM_SLAB, new FabricItemSettings()));
    public static final Item MANGROVE_BEAM = register("mangrove_beam", new BlockItem(FoundationBlocks.MANGROVE_BEAM, new FabricItemSettings()));
    public static final Item MANGROVE_BEAM_STAIRS = register("mangrove_beam_stairs", new BlockItem(FoundationBlocks.MANGROVE_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item MANGROVE_BEAM_SLAB = register("mangrove_beam_slab", new BlockItem(FoundationBlocks.MANGROVE_BEAM_SLAB, new FabricItemSettings()));
    public static final Item BAMBOO_BEAM = register("bamboo_beam", new BlockItem(FoundationBlocks.BAMBOO_BEAM, new FabricItemSettings()));
    public static final Item BAMBOO_BEAM_STAIRS = register("bamboo_beam_stairs", new BlockItem(FoundationBlocks.BAMBOO_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item BAMBOO_BEAM_SLAB = register("bamboo_beam_slab", new BlockItem(FoundationBlocks.BAMBOO_BEAM_SLAB, new FabricItemSettings()));
    public static final Item CHERRY_BEAM = register("cherry_beam", new BlockItem(FoundationBlocks.CHERRY_BEAM, new FabricItemSettings()));
    public static final Item CHERRY_BEAM_STAIRS = register("cherry_beam_stairs", new BlockItem(FoundationBlocks.CHERRY_BEAM_STAIRS, new FabricItemSettings()));
    public static final Item CHERRY_BEAM_SLAB = register("cherry_beam_slab", new BlockItem(FoundationBlocks.CHERRY_BEAM_SLAB, new FabricItemSettings()));
    // endregion

    // region SUPPORTS
    public static final Item OAK_SUPPORT = register("oak_support", new DescriptionBlockItem(FoundationBlocks.OAK_SUPPORT, new FabricItemSettings()));
    public static final Item SPRUCE_SUPPORT = register("spruce_support", new DescriptionBlockItem(FoundationBlocks.SPRUCE_SUPPORT, new FabricItemSettings()));
    public static final Item BIRCH_SUPPORT = register("birch_support", new DescriptionBlockItem(FoundationBlocks.BIRCH_SUPPORT, new FabricItemSettings()));
    public static final Item JUNGLE_SUPPORT = register("jungle_support", new DescriptionBlockItem(FoundationBlocks.JUNGLE_SUPPORT, new FabricItemSettings()));
    public static final Item ACACIA_SUPPORT = register("acacia_support", new DescriptionBlockItem(FoundationBlocks.ACACIA_SUPPORT, new FabricItemSettings()));
    public static final Item DARK_OAK_SUPPORT = register("dark_oak_support", new DescriptionBlockItem(FoundationBlocks.DARK_OAK_SUPPORT, new FabricItemSettings()));
    public static final Item CRIMSON_SUPPORT = register("crimson_support", new DescriptionBlockItem(FoundationBlocks.CRIMSON_SUPPORT, new FabricItemSettings()));
    public static final Item WARPED_SUPPORT = register("warped_support", new DescriptionBlockItem(FoundationBlocks.WARPED_SUPPORT, new FabricItemSettings()));
    public static final Item MANGROVE_SUPPORT = register("mangrove_support", new DescriptionBlockItem(FoundationBlocks.MANGROVE_SUPPORT, new FabricItemSettings()));
    public static final Item BAMBOO_SUPPORT = register("bamboo_support", new DescriptionBlockItem(FoundationBlocks.BAMBOO_SUPPORT, new FabricItemSettings()));
    public static final Item CHERRY_SUPPORT = register("cherry_support", new DescriptionBlockItem(FoundationBlocks.CHERRY_SUPPORT, new FabricItemSettings()));
    // endregion


    // region LADDERS
    public static final Item OAK_LADDER = register("oak_ladder", new DescriptionBlockItem(FoundationBlocks.OAK_LADDER, new FabricItemSettings()));
    public static final Item SPRUCE_LADDER = register("spruce_ladder", new DescriptionBlockItem(FoundationBlocks.SPRUCE_LADDER, new FabricItemSettings()));
    public static final Item BIRCH_LADDER = register("birch_ladder", new DescriptionBlockItem(FoundationBlocks.BIRCH_LADDER, new FabricItemSettings()));
    public static final Item JUNGLE_LADDER = register("jungle_ladder", new DescriptionBlockItem(FoundationBlocks.JUNGLE_LADDER, new FabricItemSettings()));
    public static final Item ACACIA_LADDER = register("acacia_ladder", new DescriptionBlockItem(FoundationBlocks.ACACIA_LADDER, new FabricItemSettings()));
    public static final Item DARK_OAK_LADDER = register("dark_oak_ladder", new DescriptionBlockItem(FoundationBlocks.DARK_OAK_LADDER, new FabricItemSettings()));
    public static final Item CRIMSON_LADDER = register("crimson_ladder", new DescriptionBlockItem(FoundationBlocks.CRIMSON_LADDER, new FabricItemSettings()));
    public static final Item WARPED_LADDER = register("warped_ladder", new DescriptionBlockItem(FoundationBlocks.WARPED_LADDER, new FabricItemSettings()));
    public static final Item MANGROVE_LADDER = register("mangrove_ladder", new DescriptionBlockItem(FoundationBlocks.MANGROVE_LADDER, new FabricItemSettings()));
    public static final Item BAMBOO_LADDER = register("bamboo_ladder", new DescriptionBlockItem(FoundationBlocks.BAMBOO_LADDER, new FabricItemSettings()));
    public static final Item CHERRY_LADDER = register("cherry_ladder", new DescriptionBlockItem(FoundationBlocks.CHERRY_LADDER, new FabricItemSettings()));
    // endregion

    // region LAYERS
    public static final Item OAK_LAYER = register("oak_layer", new DescriptionBlockItem(FoundationBlocks.OAK_LAYER, new FabricItemSettings()));
    public static final Item SPRUCE_LAYER = register("spruce_layer", new DescriptionBlockItem(FoundationBlocks.SPRUCE_LAYER, new FabricItemSettings()));
    public static final Item BIRCH_LAYER = register("birch_layer", new DescriptionBlockItem(FoundationBlocks.BIRCH_LAYER, new FabricItemSettings()));
    public static final Item JUNGLE_LAYER = register("jungle_layer", new DescriptionBlockItem(FoundationBlocks.JUNGLE_LAYER, new FabricItemSettings()));
    public static final Item ACACIA_LAYER = register("acacia_layer", new DescriptionBlockItem(FoundationBlocks.ACACIA_LAYER, new FabricItemSettings()));
    public static final Item DARK_OAK_LAYER = register("dark_oak_layer", new DescriptionBlockItem(FoundationBlocks.DARK_OAK_LAYER, new FabricItemSettings()));
    public static final Item CRIMSON_LAYER = register("crimson_layer", new DescriptionBlockItem(FoundationBlocks.CRIMSON_LAYER, new FabricItemSettings()));
    public static final Item WARPED_LAYER = register("warped_layer", new DescriptionBlockItem(FoundationBlocks.WARPED_LAYER, new FabricItemSettings()));
    public static final Item MANGROVE_LAYER = register("mangrove_layer", new DescriptionBlockItem(FoundationBlocks.MANGROVE_LAYER, new FabricItemSettings()));
    public static final Item BAMBOO_LAYER = register("bamboo_layer", new DescriptionBlockItem(FoundationBlocks.BAMBOO_LAYER, new FabricItemSettings()));
    public static final Item BAMBOO_MOSAIC_LAYER = register("bamboo_mosaic_layer", new DescriptionBlockItem(FoundationBlocks.BAMBOO_MOSAIC_LAYER, new FabricItemSettings()));
    public static final Item CHERRY_LAYER = register("cherry_layer", new DescriptionBlockItem(FoundationBlocks.CHERRY_LAYER, new FabricItemSettings()));
    public static final Item STONE_LAYER = register("stone_layer", new DescriptionBlockItem(FoundationBlocks.STONE_LAYER, new FabricItemSettings()));
    public static final Item COBBLESTONE_LAYER = register("cobblestone_layer", new DescriptionBlockItem(FoundationBlocks.COBBLESTONE_LAYER, new FabricItemSettings()));
    public static final Item MOSSY_COBBLESTONE_LAYER = register("mossy_cobblestone_layer", new DescriptionBlockItem(FoundationBlocks.MOSSY_COBBLESTONE_LAYER, new FabricItemSettings()));
    public static final Item SMOOTH_STONE_LAYER = register("smooth_stone_layer", new DescriptionBlockItem(FoundationBlocks.SMOOTH_STONE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_STONE_LAYER = register("polished_stone_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_STONE_LAYER, new FabricItemSettings()));
    public static final Item STONE_TILE_LAYER = register("stone_tile_layer", new DescriptionBlockItem(FoundationBlocks.STONE_TILE_LAYER, new FabricItemSettings()));
    public static final Item STONE_BRICK_LAYER = register("stone_brick_layer", new DescriptionBlockItem(FoundationBlocks.STONE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item MOSSY_STONE_BRICK_LAYER = register("mossy_stone_brick_layer", new DescriptionBlockItem(FoundationBlocks.MOSSY_STONE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item GRANITE_LAYER = register("granite_layer", new DescriptionBlockItem(FoundationBlocks.GRANITE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_GRANITE_LAYER = register("polished_granite_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_GRANITE_LAYER, new FabricItemSettings()));
    public static final Item DIORITE_LAYER = register("diorite_layer", new DescriptionBlockItem(FoundationBlocks.DIORITE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_DIORITE_LAYER = register("polished_diorite_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_DIORITE_LAYER, new FabricItemSettings()));
    public static final Item ANDESITE_LAYER = register("andesite_layer", new DescriptionBlockItem(FoundationBlocks.ANDESITE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_ANDESITE_LAYER = register("polished_andesite_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_ANDESITE_LAYER, new FabricItemSettings()));
    public static final Item COBBLED_DEEPSLATE_LAYER = register("cobbled_deepslate_layer", new DescriptionBlockItem(FoundationBlocks.COBBLED_DEEPSLATE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_DEEPSLATE_LAYER = register("polished_deepslate_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_DEEPSLATE_LAYER, new FabricItemSettings()));
    public static final Item DEEPSLATE_BRICK_LAYER = register("deepslate_brick_layer", new DescriptionBlockItem(FoundationBlocks.DEEPSLATE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item DEEPSLATE_TILE_LAYER = register("deepslate_tile_layer", new DescriptionBlockItem(FoundationBlocks.DEEPSLATE_TILE_LAYER, new FabricItemSettings()));
    public static final Item BRICK_LAYER = register("brick_layer", new DescriptionBlockItem(FoundationBlocks.BRICK_LAYER, new FabricItemSettings()));
    public static final Item MUD_BRICK_LAYER = register("mud_brick_layer", new DescriptionBlockItem(FoundationBlocks.MUD_BRICK_LAYER, new FabricItemSettings()));
    public static final Item SANDSTONE_LAYER = register("sandstone_layer", new DescriptionBlockItem(FoundationBlocks.SANDSTONE_LAYER, new FabricItemSettings()));
    public static final Item SMOOTH_SANDSTONE_LAYER = register("smooth_sandstone_layer", new DescriptionBlockItem(FoundationBlocks.SMOOTH_SANDSTONE_LAYER, new FabricItemSettings()));
    public static final Item RED_SANDSTONE_LAYER = register("red_sandstone_layer", new DescriptionBlockItem(FoundationBlocks.RED_SANDSTONE_LAYER, new FabricItemSettings()));
    public static final Item SMOOTH_RED_SANDSTONE_LAYER = register("smooth_red_sandstone_layer", new DescriptionBlockItem(FoundationBlocks.SMOOTH_RED_SANDSTONE_LAYER, new FabricItemSettings()));
    public static final Item PRISMARINE_LAYER = register("prismarine_layer", new DescriptionBlockItem(FoundationBlocks.PRISMARINE_LAYER, new FabricItemSettings()));
    public static final Item PRISMARINE_BRICK_LAYER = register("prismarine_brick_layer", new DescriptionBlockItem(FoundationBlocks.PRISMARINE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item DARK_PRISMARINE_LAYER = register("dark_prismarine_layer", new DescriptionBlockItem(FoundationBlocks.DARK_PRISMARINE_LAYER, new FabricItemSettings()));
    public static final Item NETHER_BRICK_LAYER = register("nether_brick_layer", new DescriptionBlockItem(FoundationBlocks.NETHER_BRICK_LAYER, new FabricItemSettings()));
    public static final Item RED_NETHER_BRICK_LAYER = register("red_nether_brick_layer", new DescriptionBlockItem(FoundationBlocks.RED_NETHER_BRICK_LAYER, new FabricItemSettings()));
    public static final Item BLACKSTONE_LAYER = register("blackstone_layer", new DescriptionBlockItem(FoundationBlocks.BLACKSTONE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_BLACKSTONE_LAYER = register("polished_blackstone_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_BLACKSTONE_LAYER, new FabricItemSettings()));
    public static final Item POLISHED_BLACKSTONE_BRICK_LAYER = register("polished_blackstone_brick_layer", new DescriptionBlockItem(FoundationBlocks.POLISHED_BLACKSTONE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item END_STONE_BRICK_LAYER = register("end_stone_brick_layer", new DescriptionBlockItem(FoundationBlocks.END_STONE_BRICK_LAYER, new FabricItemSettings()));
    public static final Item PURPUR_LAYER = register("purpur_layer", new DescriptionBlockItem(FoundationBlocks.PURPUR_LAYER, new FabricItemSettings()));
    public static final Item QUARTZ_LAYER = register("quartz_layer", new DescriptionBlockItem(FoundationBlocks.QUARTZ_LAYER, new FabricItemSettings()));
    public static final Item CUT_COPPER_LAYER = register("cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item EXPOSED_CUT_COPPER_LAYER = register("exposed_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.EXPOSED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item WEATHERED_CUT_COPPER_LAYER = register("weathered_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.WEATHERED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item OXIDIZED_CUT_COPPER_LAYER = register("oxidized_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.OXIDIZED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item WAXED_CUT_COPPER_LAYER = register("waxed_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.WAXED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item WAXED_EXPOSED_CUT_COPPER_LAYER = register("waxed_exposed_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.WAXED_EXPOSED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item WAXED_WEATHERED_CUT_COPPER_LAYER = register("waxed_weathered_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.WAXED_WEATHERED_CUT_COPPER_LAYER, new FabricItemSettings()));
    public static final Item WAXED_OXIDIZED_CUT_COPPER_LAYER = register("waxed_oxidized_cut_copper_layer", new DescriptionBlockItem(FoundationBlocks.WAXED_OXIDIZED_CUT_COPPER_LAYER, new FabricItemSettings()));

    // endregion
    

    public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(FoundationBlocks.POLISHED_STONE, new FabricItemSettings()));
    public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(FoundationBlocks.POLISHED_STONE_STAIRS, new FabricItemSettings()));
    public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(FoundationBlocks.POLISHED_STONE_SLAB, new FabricItemSettings()));

    public static final Item STONE_TILES = register("stone_tiles", new BlockItem(FoundationBlocks.STONE_TILES, new FabricItemSettings()));
    public static final Item STONE_TILE_STAIRS = register("stone_tile_stairs", new BlockItem(FoundationBlocks.STONE_TILE_STAIRS, new FabricItemSettings()));
    public static final Item STONE_TILE_SLAB = register("stone_tile_slab", new BlockItem(FoundationBlocks.STONE_TILE_SLAB, new FabricItemSettings()));

    public static final Item BRAZIER = register("brazier", new BlockItem(FoundationBlocks.BRAZIER, new FabricItemSettings()));
    public static final Item SOUL_BRAZIER = register("soul_brazier", new BlockItem(FoundationBlocks.SOUL_BRAZIER, new FabricItemSettings()));


    public static final Item ROOFING = register("roofing", new BlockItem(FoundationBlocks.ROOFING, new FabricItemSettings()));


    // region PALLETS
    public static final Item OAK_PALLET = register("oak_pallet", new DescriptionBlockItem(FoundationBlocks.OAK_PALLET, new FabricItemSettings()));
    public static final Item SPRUCE_PALLET = register("spruce_pallet", new DescriptionBlockItem(FoundationBlocks.SPRUCE_PALLET, new FabricItemSettings()));
    public static final Item BIRCH_PALLET = register("birch_pallet", new DescriptionBlockItem(FoundationBlocks.BIRCH_PALLET, new FabricItemSettings()));
    public static final Item JUNGLE_PALLET = register("jungle_pallet", new DescriptionBlockItem(FoundationBlocks.JUNGLE_PALLET, new FabricItemSettings()));
    public static final Item ACACIA_PALLET = register("acacia_pallet", new DescriptionBlockItem(FoundationBlocks.ACACIA_PALLET, new FabricItemSettings()));
    public static final Item DARK_OAK_PALLET = register("dark_oak_pallet", new DescriptionBlockItem(FoundationBlocks.DARK_OAK_PALLET, new FabricItemSettings()));
    public static final Item MANGROVE_PALLET = register("mangrove_pallet", new DescriptionBlockItem(FoundationBlocks.MANGROVE_PALLET, new FabricItemSettings()));
    public static final Item CHERRY_PALLET = register("cherry_pallet", new DescriptionBlockItem(FoundationBlocks.CHERRY_PALLET, new FabricItemSettings()));
    public static final Item BAMBOO_PALLET = register("bamboo_pallet", new DescriptionBlockItem(FoundationBlocks.BAMBOO_PALLET, new FabricItemSettings()));
    public static final Item CRIMSON_PALLET = register("crimson_pallet", new DescriptionBlockItem(FoundationBlocks.CRIMSON_PALLET, new FabricItemSettings()));
    public static final Item WARPED_PALLET = register("warped_pallet", new DescriptionBlockItem(FoundationBlocks.WARPED_PALLET, new FabricItemSettings()));
    // endregion

    // region FRAMES
    public static final Item OAK_FRAME = register("oak_frame", new DescriptionBlockItem(FoundationBlocks.OAK_FRAME, new FabricItemSettings()));
    public static final Item SPRUCE_FRAME = register("spruce_frame", new DescriptionBlockItem(FoundationBlocks.SPRUCE_FRAME, new FabricItemSettings()));
    public static final Item BIRCH_FRAME = register("birch_frame", new DescriptionBlockItem(FoundationBlocks.BIRCH_FRAME, new FabricItemSettings()));
    public static final Item JUNGLE_FRAME = register("jungle_frame", new DescriptionBlockItem(FoundationBlocks.JUNGLE_FRAME, new FabricItemSettings()));
    public static final Item ACACIA_FRAME = register("acacia_frame", new DescriptionBlockItem(FoundationBlocks.ACACIA_FRAME, new FabricItemSettings()));
    public static final Item DARK_OAK_FRAME = register("dark_oak_frame", new DescriptionBlockItem(FoundationBlocks.DARK_OAK_FRAME, new FabricItemSettings()));
    public static final Item MANGROVE_FRAME = register("mangrove_frame", new DescriptionBlockItem(FoundationBlocks.MANGROVE_FRAME, new FabricItemSettings()));
    public static final Item CHERRY_FRAME = register("cherry_frame", new DescriptionBlockItem(FoundationBlocks.CHERRY_FRAME, new FabricItemSettings()));
    public static final Item BAMBOO_FRAME = register("bamboo_frame", new DescriptionBlockItem(FoundationBlocks.BAMBOO_FRAME, new FabricItemSettings()));
    public static final Item CRIMSON_FRAME = register("crimson_frame", new DescriptionBlockItem(FoundationBlocks.CRIMSON_FRAME, new FabricItemSettings()));
    public static final Item WARPED_FRAME = register("warped_frame", new DescriptionBlockItem(FoundationBlocks.WARPED_FRAME, new FabricItemSettings()));
    // endregion


    public static final Item ROPE = register("rope", new BlockItem(FoundationBlocks.ROPE, new FabricItemSettings()));

    // region WOODEN LANTERNS
    public static final Item OAK_LANTERN = register("oak_lantern", new BlockItem(FoundationBlocks.OAK_LANTERN, new FabricItemSettings()));
    public static final Item SPRUCE_LANTERN = register("spruce_lantern", new BlockItem(FoundationBlocks.SPRUCE_LANTERN, new FabricItemSettings()));
    public static final Item BIRCH_LANTERN = register("birch_lantern", new BlockItem(FoundationBlocks.BIRCH_LANTERN, new FabricItemSettings()));
    public static final Item JUNGLE_LANTERN = register("jungle_lantern", new BlockItem(FoundationBlocks.JUNGLE_LANTERN, new FabricItemSettings()));
    public static final Item ACACIA_LANTERN = register("acacia_lantern", new BlockItem(FoundationBlocks.ACACIA_LANTERN, new FabricItemSettings()));
    public static final Item DARK_OAK_LANTERN = register("dark_oak_lantern", new BlockItem(FoundationBlocks.DARK_OAK_LANTERN, new FabricItemSettings()));
    public static final Item MANGROVE_LANTERN = register("mangrove_lantern", new BlockItem(FoundationBlocks.MANGROVE_LANTERN, new FabricItemSettings()));
    public static final Item CHERRY_LANTERN = register("cherry_lantern", new BlockItem(FoundationBlocks.CHERRY_LANTERN, new FabricItemSettings()));
    public static final Item BAMBOO_LANTERN = register("bamboo_lantern", new BlockItem(FoundationBlocks.BAMBOO_LANTERN, new FabricItemSettings()));
    public static final Item CRIMSON_LANTERN = register("crimson_lantern", new BlockItem(FoundationBlocks.CRIMSON_LANTERN, new FabricItemSettings()));
    public static final Item WARPED_LANTERN = register("warped_lantern", new BlockItem(FoundationBlocks.WARPED_LANTERN, new FabricItemSettings()));
    // endregion

    // region TRIMS

    public static final Item OAK_TRIM = register("oak_trim", new BlockItem(FoundationBlocks.OAK_TRIM, new FabricItemSettings()));
    public static final Item SPRUCE_TRIM = register("spruce_trim", new BlockItem(FoundationBlocks.SPRUCE_TRIM, new FabricItemSettings()));
    public static final Item BIRCH_TRIM = register("birch_trim", new BlockItem(FoundationBlocks.BIRCH_TRIM, new FabricItemSettings()));
    public static final Item JUNGLE_TRIM = register("jungle_trim", new BlockItem(FoundationBlocks.JUNGLE_TRIM, new FabricItemSettings()));
    public static final Item ACACIA_TRIM = register("acacia_trim", new BlockItem(FoundationBlocks.ACACIA_TRIM, new FabricItemSettings()));
    public static final Item DARK_OAK_TRIM = register("dark_oak_trim", new BlockItem(FoundationBlocks.DARK_OAK_TRIM, new FabricItemSettings()));
    public static final Item MANGROVE_TRIM = register("mangrove_trim", new BlockItem(FoundationBlocks.MANGROVE_TRIM, new FabricItemSettings()));
    public static final Item CHERRY_TRIM = register("cherry_trim", new BlockItem(FoundationBlocks.CHERRY_TRIM, new FabricItemSettings()));
    public static final Item BAMBOO_TRIM = register("bamboo_trim", new BlockItem(FoundationBlocks.BAMBOO_TRIM, new FabricItemSettings()));
    public static final Item CRIMSON_TRIM = register("crimson_trim", new BlockItem(FoundationBlocks.CRIMSON_TRIM, new FabricItemSettings()));
    public static final Item WARPED_TRIM = register("warped_trim", new BlockItem(FoundationBlocks.WARPED_TRIM, new FabricItemSettings()));
    // endregion

    public static final Item IRON_FENCE = register("iron_fence", new BlockItem(FoundationBlocks.IRON_FENCE, new FabricItemSettings()));


    //public static final Item TALL_OAK_DOOR = register("tall_oak_door", new TallDoorItem(FoundationBlocks.TALL_OAK_DOOR, new FabricItemSettings()));

    public static final Item BIG_DOOR = register("big_door", new BlockItem(FoundationBlocks.BIG_DOOR, new FabricItemSettings()));

    private static Item register(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Foundation.MOD_ID, id), item);
    }
}
