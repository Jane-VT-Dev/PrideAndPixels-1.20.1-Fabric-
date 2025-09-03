package com.june;

import com.june.blocks.ModBlocks;
import com.june.effects.ModEffects;
import com.june.item.*;
import com.june.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PridePixels implements ModInitializer {
	public static final String MOD_ID = "pridepixels";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
		ModSwords.registerModSwords();
		ModAxes.registerModAxes();
		ModPickaxes.registerModPickaxes();
		ModShovels.registerModShovels();
		ModHoes.registerModHoes();
		ModArmors.registerModArmors();
		ModSpecialWeapons.registerModWeapons();
		ModEffects.registerEffects();
	}
	}
