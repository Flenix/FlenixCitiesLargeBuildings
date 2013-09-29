package co.uk.silvania.cities.largebuildings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerRenderers() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FCLB_Blocks.escalator, "escalator");
        GameRegistry.registerBlock(FCLB_Blocks.travellator, "travellator");
        
    	/*GameRegistry.registerItem(FCLB_Items.trainTicket, "trainTicket");
    	GameRegistry.registerItem(FCLB_Items.theatreTicket, "theatreTicket");

    	GameRegistry.registerItem(FCLB_Items.baseballBat, "baseballBat");
    	GameRegistry.registerItem(FCLB_Items.baseballItem, "baseballItem");
    	GameRegistry.registerItem(FCLB_Items.americanFootball, "americanFootball");*/
    	GameRegistry.registerItem(FCLB_Items.tennisBall, "tennisBall");
    	GameRegistry.registerItem(FCLB_Items.soccerBall, "soccerBall");
    	//GameRegistry.registerItem(FCLB_Items.tennisRacquet, "tennisRacquet");
    }
    
    public void addNames() {
        LanguageRegistry.addName(FCLB_Blocks.escalator, "Escalator");
        LanguageRegistry.addName(FCLB_Blocks.travellator, "Travellator");
        
    	/*LanguageRegistry.addName(FCLB_Items.trainTicket, "Train Ticket");
    	LanguageRegistry.addName(FCLB_Items.theatreTicket, "Theatre Ticket");

    	LanguageRegistry.addName(FCLB_Items.baseballBat, "Baseball Bat");
    	LanguageRegistry.addName(FCLB_Items.baseballItem, "Baseball Item");
    	LanguageRegistry.addName(FCLB_Items.americanFootball, "American Football");*/
    	LanguageRegistry.addName(FCLB_Items.tennisBall, "Tennis Ball");
    	LanguageRegistry.addName(FCLB_Items.soccerBall, "Soccer Ball");
    	//LanguageRegistry.addName(FCLB_Items.tennisRacquet, "Tennis Racquet");
    }
    
    public void addRecipes() {
    	
    }

}
