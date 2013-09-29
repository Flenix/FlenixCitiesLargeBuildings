package co.uk.silvania.cities.largebuildings;

import co.uk.silvania.cities.largebuildings.blocks.TileEntityEscalatorBlock;
import co.uk.silvania.cities.largebuildings.blocks.TileEntityTravellatorBlock;
import net.minecraft.block.Block;

public class FCLB_Blocks {
	private static LBConfig config;
	
	public static Block escalator;
	public static Block travellator;
	
	
	public static void init() {
		initBlocks();
	}
	
	public static void initBlocks() {
    	escalator = new TileEntityEscalatorBlock(config.escalatorID).setUnlocalizedName("escalator");
    	travellator = new TileEntityTravellatorBlock(config.travellatorID).setUnlocalizedName("travellator");
	}
}
