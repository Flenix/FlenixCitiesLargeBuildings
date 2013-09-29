package co.uk.silvania.cities.largebuildings.client;

import co.uk.silvania.cities.largebuildings.CommonProxy;
import co.uk.silvania.cities.largebuildings.blocks.*;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEscalatorEntity.class, new TileEntityEscalatorRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTravellatorEntity.class, new TileEntityTravellatorRenderer());
    }        
}