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
                        entries.add(ModBlocks.FLAXEN_EPHYTA);
                        entries.add(ModBlocks.ABYSSALT);
                        entries.add(ModBlocks.HARMONIC_LOG);
                        entries.add(ModBlocks.HARMONIC_PLANKS);
                        entries.add(ModBlocks.HARMONIC_MOSAIC);
                        entries.add(ModBlocks.HARMONIC_LEAVES);
                        entries.add(ModBlocks.END_STONE_PILLAR);
                    }).build());
    public static void registerItemGroups(){
        EchoingVoid.LOGGER.info("Registering Item Groups - "+EchoingVoid.MOD_ID);
    }
}
