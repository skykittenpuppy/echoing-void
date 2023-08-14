package gay.beegirl.registries;

import gay.beegirl.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.HARMONIC_LOG, ModBlocks.STRIPPED_HARMONIC_LOG);
    }
}
