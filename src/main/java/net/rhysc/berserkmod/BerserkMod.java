package net.rhysc.berserkmod;

import net.fabricmc.api.ModInitializer;
import net.rhysc.berserkmod.block.ModBlocks;
import net.rhysc.berserkmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BerserkMod implements ModInitializer {
	public static final String MOD_ID = "berserkmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
