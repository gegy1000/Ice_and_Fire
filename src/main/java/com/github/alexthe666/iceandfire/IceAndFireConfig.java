package com.github.alexthe666.iceandfire;

import net.ilexiconn.llibrary.server.config.ConfigEntry;

public class IceAndFireConfig {

	@ConfigEntry(category = "generation")
	public boolean generateSilverOre = true;
	@ConfigEntry(category = "generation")
	public boolean generateSapphireOre = true;
	@ConfigEntry(category = "generation")
	public boolean generateDragonSkeletons = true;
	@ConfigEntry(category = "generation")
	public boolean generateDragonDens = true;
	@ConfigEntry(category = "generation")
	public boolean generateDragonRoosts = true;
	@ConfigEntry(category = "generation")
	public boolean generateSnowVillages = true;
	@ConfigEntry(category = "dragon griefing - 2 is no griefing, 1 is breaking weak blocks, 0 is default")
	public int dragonGriefing = 0;
}
