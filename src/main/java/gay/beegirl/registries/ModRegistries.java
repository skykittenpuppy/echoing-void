package gay.beegirl.registries;

import gay.beegirl.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.EDGEHANGER_LOG, ModBlocks.EDGEHANGER_LOG_STRIPPED);
        StrippableBlockRegistry.register(ModBlocks.HARMONIC_LOG, ModBlocks.HARMONIC_LOG_STRIPPED);
    }
}
