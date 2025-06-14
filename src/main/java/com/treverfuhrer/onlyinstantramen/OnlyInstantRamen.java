package com.treverfuhrer.onlyinstantramen;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.treverfuhrer.onlyinstantramen.item.ModItems;

public class OnlyInstantRamen implements ModInitializer {
	public static final String MOD_ID = "onlyinstantramen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}