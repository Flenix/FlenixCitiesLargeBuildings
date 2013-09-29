package co.uk.silvania.cities.largebuildings.blocks;

import co.uk.silvania.cities.core.FlenixCities_Core;
import co.uk.silvania.cities.largebuildings.FlenixCities_LargeBuildings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityTravellatorBlock extends BlockContainer {
	

	public TileEntityTravellatorBlock(int id) {
		super(id, Material.iron);
		this.setCreativeTab(FlenixCities_LargeBuildings.tabLargeBuildings);
        this.setBlockBounds(0.0F, -0.5F, 0.0F, 1.0F, 0.1F, 1.0F);
		this.setHardness(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityTravellatorEntity();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(FlenixCities_LargeBuildings.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
    public int getRenderBlockPass()
    {
        return 1;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (l == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 0);
		}

		if (l == 1) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 0);
		}

		if (l == 2) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 0);
		}

		if (l == 3) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 0);
		}
	}	
}