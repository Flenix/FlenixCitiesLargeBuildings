package co.uk.silvania.cities.largebuildings;

import co.uk.silvania.cities.largebuildings.items.GenericItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class FCLB_Items {
	private static LBConfig config;
	
	public static Item trainTicket;
	public static Item theatreTicket;
	public static Item baseballBat;
	public static Item baseballItem;
	public static Item americanFootball;
	public static Item tennisBall;
	public static Item soccerBall;
	public static Item tennisRacquet;
	
	public static void init() {
		initItems();
	}
	
	public static void initItems() {
		/*trainTicket = new GenericItems(config.trainTicketID, 64).setUnlocalizedName("trainTicket");
		theatreTicket = new GenericItems(config.theatreTicketID, 64).setUnlocalizedName("theatreTicket");
		baseballBat = new GenericItems(config.baseballBatID, 1).setUnlocalizedName("baseballBat");
		baseballItem = new GenericItems(config.baseballItemID, 64).setUnlocalizedName("baseballItem");
		americanFootball = new GenericItems(config.americanFootballID, 64).setUnlocalizedName("americanFootball");*/
		tennisBall = new GenericItems(config.tennisBallID, 64).setUnlocalizedName("tennisBall");
		soccerBall = new GenericItems(config.soccerBallID, 64).setUnlocalizedName("soccerBall");
		//tennisRacquet = new GenericItems(config.tennisRacquetID, 64).setUnlocalizedName("tennisRacquet");
	}
}
