package gay.beegirl.item;

import gay.beegirl.EchoingVoid;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EchoingVoid.MOD_ID, name), item);
    }

    public static void registerItems() {
        EchoingVoid.LOGGER.info("Registering Mod Items - "+EchoingVoid.MOD_ID);
    }
}
