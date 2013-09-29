package co.uk.silvania.cities.largebuildings.items;

import co.uk.silvania.cities.largebuildings.FlenixCities_LargeBuildings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class GenericItems extends Item {

	public GenericItems(int id, int stack) {
		super(id);
		this.setCreativeTab(FlenixCities_LargeBuildings.tabLargeBuildings);
		this.maxStackSize = stack;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_LargeBuildings.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}