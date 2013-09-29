package co.uk.silvania.cities.largebuildings;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class LBConfig {
	
	public static File fcLBConfigFile;
	
	public static void init(String configpath) {
		fcLBConfigFile = new File(configpath + "FlenixCities_LargeBuildings.cfg");
		
		LBConfig.initConfig(fcLBConfigFile);
	}
	
    public static Configuration config;
	
	public static int escalatorID;
	public static int travellatorID;

	public static int trainTicketID;
	public static int theatreTicketID;
	public static int baseballBatID;
	public static int baseballItemID;
	public static int americanFootballID;
	public static int tennisBallID;
	public static int soccerBallID;
	public static int tennisRacquetID;
	
	public static void initConfig (File configFile) {
		config = new Configuration(configFile);
		
		try {
			config.load();
			escalatorID = config.getBlock("Escalator", 1400).getInt();
			travellatorID = config.getBlock("Travellator", 1401).getInt();
	
			trainTicketID = config.getItem("Train Ticket", 18080).getInt();
			theatreTicketID = config.getItem("Theatre Ticket", 18081).getInt();
			baseballBatID = config.getItem("Baseball Bat", 18083).getInt();
			baseballItemID = config.getItem("Baseball", 18084).getInt();
			americanFootballID = config.getItem("American Football", 18085).getInt();
			tennisBallID = config.getItem("Tennis Ball", 18086).getInt();
			soccerBallID = config.getItem("Soccer Ball", 18087).getInt();
			tennisRacquetID = config.getItem("Tennis Racquet", 18088).getInt();
		}
		
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "### Warning! FlenixCities Streets could not load it's config file! ###");
		}
		
		finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}
}
