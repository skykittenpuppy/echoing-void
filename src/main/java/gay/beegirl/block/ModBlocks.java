package gay.beegirl.block;

import gay.beegirl.EchoingVoid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FLAXEN_EPHYTA = registerBlock("flaxen_ephyta",
            new EphytaBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)));
    public static final Block ABYSSALT = registerBlock("abyssalt",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block HARMONIC_LOG = registerBlock("harmonic_log",
            new ThinLogBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block STRIPPED_HARMONIC_LOG = registerBlock("stripped_harmonic_log",
            new ThinLogBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block HARMONIC_PLANKS = registerBlock("harmonic_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block HARMONIC_MOSAIC = registerBlock("harmonic_mosaic",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block HARMONIC_LEAVES = registerBlock("harmonic_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block EDGEHANGER_PLANKS = registerBlock("edgehanger_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block EDGEHANGER_LEAVES = registerBlock("edgehanger_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_GATEWAY_PEDESTAL = registerBlock("end_gateway_pedestal",
            new GatewayPedestalBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

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
