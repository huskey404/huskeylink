package net.huskey.huskeylink;

import net.fabricmc.api.ModInitializer;
import net.huskey.huskeylink.block.ModBlocks;
import net.huskey.huskeylink.item.ModItemGroups;
import net.huskey.huskeylink.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HuskeyLINK implements ModInitializer {
	public static final String MOD_ID = "huskeylink";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("huskeyOS launched!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}