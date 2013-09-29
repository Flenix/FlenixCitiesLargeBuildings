package co.uk.silvania.cities.largebuildings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import co.uk.silvania.cities.GuiHandler;
import co.uk.silvania.cities.core.CoreBlocks;
import co.uk.silvania.cities.core.FlenixCities_Core;
import co.uk.silvania.cities.largebuildings.blocks.TileEntityEscalatorEntity;
import co.uk.silvania.cities.largebuildings.blocks.TileEntityTravellatorEntity;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid=FlenixCities_LargeBuildings.modid, name="FlenixCities LargeBuildings", version="0.1.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_LargeBuildings { 
	
	public static final String modid = "fc_largebuildings";
	
    @Instance(FlenixCities_LargeBuildings.modid)
    public static FlenixCities_LargeBuildings instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.largebuildings.client.ClientProxy", serverSide="co.uk.silvania.cities.largebuildings.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabLargeBuildings = new CreativeTabs("tabLargeBuildings") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FCLB_Items.soccerBall, 1, 0);
		}
	};
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	LBConfig.init(FlenixCities_Core.configPath);
    	
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	FCLB_Blocks.init();
    	FCLB_Items.init();
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        proxy.addNames();
        
        GameRegistry.registerTileEntity(TileEntityEscalatorEntity.class, "tileEntityEscalator");
        GameRegistry.registerTileEntity(TileEntityTravellatorEntity.class, "tileEntityTravellator");
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabLargeBuildings", "en_US", "Cities: Large Buildings"); 
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};