package gay.beegirl;

import gay.beegirl.block.ModBlocks;
import gay.beegirl.item.ModItemGroups;
import gay.beegirl.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoingVoid implements ModInitializer {
	public static final String MOD_ID = "echoing-void";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();
		//ModItems.registerItems();
	}
}