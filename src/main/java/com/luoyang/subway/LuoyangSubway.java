package com.luoyang.subway;

import com.luoyang.blocks.ModBlocks;
import com.luoyang.item.ModitemGroups;
import com.luoyang.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuoyangSubway implements ModInitializer {
	public static final String MOD_ID = "luoyang-subway";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private ModitemGroups ModitemGroups;

	@Override
	public void onInitialize() {
		com.luoyang.item.ModitemGroups.registerGroups();
		ModBlocks.registerBlocks();
		Moditems.registerItems();
		LOGGER.info("/----洛------------------------------阳----| |----地-------------------------------铁----|");
	}
}