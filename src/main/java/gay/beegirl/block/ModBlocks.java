package gay.beegirl.block;

import gay.beegirl.EchoingVoid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ABYSSALT = registerBlock("abyssalt",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block ABYSSALT_BRICKS = registerBlock("abyssalt_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block ABYSSALT_EDGEHANGER_FRAME = registerBlock("abyssalt_edgehanger_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block ABYSSALT_HARMONIC_FRAME = registerBlock("abyssalt_harmonic_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block EDGEHANGER_LEAVES = registerBlock("edgehanger_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block EDGEHANGER_LOG = registerBlock("edgehanger_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)));
    public static final Block EDGEHANGER_LOG_STRIPPED = registerBlock("edgehanger_log_stripped",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)));
    public static final Block EDGEHANGER_PLANKS = registerBlock("edgehanger_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block EDGEHANGER_SAPLING = registerBlock("edgehanger_sapling",
            new SaplingBlock(new OakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING)));

    public static final Block END_STONE_BRICKS_CRACKED = registerBlock("end_stone_bricks_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_CHISELED = registerBlock("end_stone_chiseled",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_SMOOTH = registerBlock("end_stone_smooth",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_TILES_CRACKED = registerBlock("end_stone_tiles_cracked",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_EDGEHANGER_PILLAR = registerBlock("end_stone_edgehanger_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_HARMONIC_PILLAR = registerBlock("end_stone_harmonic_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_EDGEHANGER_FRAME = registerBlock("end_stone_edgehanger_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_HARMONIC_FRAME = registerBlock("end_stone_harmonic_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    public static final Block ENDSLATE = registerBlock("endslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ENDSLATE_EDGEHANGER_FRAME = registerBlock("endslate_edgehanger_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ENDSLATE_HARMONIC_FRAME = registerBlock("endslate_harmonic_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block HARMONIC_LEAVES = registerBlock("harmonic_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block HARMONIC_LOG = registerBlock("harmonic_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)));
    public static final Block HARMONIC_LOG_STRIPPED = registerBlock("harmonic_log_stripped",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)));
    public static final Block HARMONIC_PLANKS = registerBlock("harmonic_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block HARMONIC_SAPLING = registerBlock("harmonic_sapling",
            new SaplingBlock(new OakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING)));

    public static final Block PRASINE_BLOCK = registerBlock("prasine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PRASINE_ENGRAVED = registerBlock("prasine_engraved",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PRASINE_END_STONE_PILLAR = registerBlock("prasine_end_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PURPUR_MOSAIC = registerBlock("purpur_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILES = registerBlock("purpur_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block VIRIDACITE = registerBlock("viridacite",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block VIRIDACITE_PILLAR = registerBlock("viridacite_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block VIRIDACITE_EDGEHANGER_FRAME = registerBlock("viridacite_edgehanger_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block VIRIDACITE_HARMONIC_FRAME = registerBlock("viridacite_harmonic_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    
    public static final Block FLAXEN_EPHYTA = registerBlock("flaxen_ephyta",
            new EphytaBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)));
    public static final Block LURID_EPHYTA = registerBlock("lurid_ephyta",
            new EphytaBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)));
    public static final Block CONDENSED_VOID = registerBlock("condensed_void",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block OBSIDIAN_FANCY = registerBlock("obsidian_fancy",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));

    public static final Block AMBER_SHRUB = registerBlock("amber_shrub",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block AMBER_VINE = registerBlock("amber_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));
    public static final Block BEIGE_GRASS = registerBlock("beige_grass",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BEIGE_GRASS_SHORT = registerBlock("beige_grass_short",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BEIGE_GRASS_TALL = registerBlock("beige_grass_tall",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BEIGE_GRASS_FLOWERING = registerBlock("beige_grass_flowering",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BLOSSOMING_RHYTHM = registerBlock("blossoming_rhythm",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block BULBOUS_MELODY = registerBlock("bulbous_melody",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BULBOUS_MELODY_TALL = registerBlock("bulbous_melody_tall",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block FLAXEN_FUNNELS = registerBlock("flaxen_funnels",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block FLAXEN_FUNNELS_TALL = registerBlock("flaxen_funnels_tall",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block FLOWERING_VOID = registerBlock("flowering_void",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block TAWNY_FERN = registerBlock("tawny_fern",
            new FlowerBlock(StatusEffects.LUCK, 0, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block TAWNY_FERN_TALL = registerBlock("tawny_fern_tall",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block VOID_STALKS = registerBlock("void_stalks",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EchoingVoid.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(EchoingVoid.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        EchoingVoid.LOGGER.info("Registering Blocks - "+EchoingVoid.MOD_ID);
    }
}
