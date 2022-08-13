package net.boro.professionmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.boro.professionmod.item.ModItems;

public class ProfessionMod implements ModInitializer {
	public static final String MOD_ID = "professionmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
