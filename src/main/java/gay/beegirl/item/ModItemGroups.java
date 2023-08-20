package gay.beegirl.item;

import gay.beegirl.EchoingVoid;
import gay.beegirl.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ECHOING_VOID = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoingVoid.MOD_ID, "echoing_void"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.echoing_void"))
                    .icon(() -> new ItemStack(ModBlocks.FLAXEN_EPHYTA)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ABYSSALT);
                        entries.add(ModBlocks.ABYSSALT_BRICKS);
                        entries.add(ModBlocks.ABYSSALT_EDGEHANGER_FRAME);
                        entries.add(ModBlocks.ABYSSALT_HARMONIC_FRAME);
                        entries.add(ModBlocks.EDGEHANGER_LEAVES);
                        entries.add(ModBlocks.EDGEHANGER_LOG);
                        entries.add(ModBlocks.EDGEHANGER_LOG_STRIPPED);
                        entries.add(ModBlocks.EDGEHANGER_PLANKS);
                        entries.add(ModBlocks.EDGEHANGER_SAPLING);
                        entries.add(ModBlocks.EDGEHANGER_FENCE);
                        entries.add(ModBlocks.EDGEHANGER_FENCE_GATE);
                        entries.add(ModBlocks.EDGEHANGER_DOOR);
                        entries.add(ModBlocks.END_STONE_BRICKS_CRACKED);
                        entries.add(ModBlocks.END_STONE_CHISELED);
                        entries.add(ModBlocks.END_STONE_PILLAR);
                        entries.add(ModBlocks.END_STONE_SMOOTH);
                        entries.add(ModBlocks.END_STONE_TILES);
                        entries.add(ModBlocks.END_STONE_TILES_CRACKED);
                        entries.add(ModBlocks.END_STONE_EDGEHANGER_PILLAR);
                        entries.add(ModBlocks.END_STONE_HARMONIC_PILLAR);
                        entries.add(ModBlocks.END_STONE_EDGEHANGER_FRAME);
                        entries.add(ModBlocks.END_STONE_HARMONIC_FRAME);
                        entries.add(ModBlocks.ENDSLATE);
                        entries.add(ModBlocks.ENDSLATE_EDGEHANGER_FRAME);
                        entries.add(ModBlocks.ENDSLATE_HARMONIC_FRAME);
                        entries.add(ModBlocks.HARMONIC_LEAVES);
                        entries.add(ModBlocks.HARMONIC_LOG);
                        entries.add(ModBlocks.HARMONIC_LOG_STRIPPED);
                        entries.add(ModBlocks.HARMONIC_PLANKS);
                        entries.add(ModBlocks.HARMONIC_SAPLING);
                        entries.add(ModBlocks.HARMONIC_LATTICE);
                        entries.add(ModBlocks.HARMONIC_DOOR);
                        entries.add(ModBlocks.PRASINE_BLOCK);
                        entries.add(ModBlocks.PRASINE_ENGRAVED);
                        entries.add(ModBlocks.PRASINE_END_STONE_PILLAR);
                        entries.add(ModBlocks.PURPUR_MOSAIC);
                        entries.add(ModBlocks.PURPUR_TILES);
                        entries.add(ModBlocks.VIRIDACITE);
                        entries.add(ModBlocks.VIRIDACITE_PILLAR);
                        entries.add(ModBlocks.VIRIDACITE_EDGEHANGER_FRAME);
                        entries.add(ModBlocks.VIRIDACITE_HARMONIC_FRAME);
                        entries.add(ModBlocks.FLAXEN_EPHYTA);
                        entries.add(ModBlocks.LURID_EPHYTA);
                        entries.add(ModBlocks.CONDENSED_VOID);
                        entries.add(ModBlocks.OBSIDIAN_FANCY);
                        entries.add(ModBlocks.AMBER_SHRUB);
                        entries.add(ModBlocks.AMBER_VINE);
                        entries.add(ModBlocks.BEIGE_GRASS);
                        entries.add(ModBlocks.BEIGE_GRASS_SHORT);
                        entries.add(ModBlocks.BEIGE_GRASS_TALL);
                        entries.add(ModBlocks.BEIGE_GRASS_FLOWERING);
                        entries.add(ModBlocks.BLOSSOMING_RHYTHM);
                        entries.add(ModBlocks.BULBOUS_MELODY);
                        entries.add(ModBlocks.BULBOUS_MELODY_TALL);
                        entries.add(ModBlocks.FLAXEN_FUNNELS);
                        entries.add(ModBlocks.FLAXEN_FUNNELS_TALL);
                        entries.add(ModBlocks.FLOWERING_VOID);
                        entries.add(ModBlocks.TAWNY_FERN);
                        entries.add(ModBlocks.TAWNY_FERN_TALL);
                        entries.add(ModBlocks.VOID_STALKS);
                    }).build());
    public static void registerItemGroups(){
        EchoingVoid.LOGGER.info("Registering Item Groups - "+EchoingVoid.MOD_ID);
    }
}
