package com.sparkymc.expansionmod.blocks;

import com.sparkymc.expansionmod.Main;
import com.sparkymc.expansionmod.blocks.machines.compressor.TileEntityCompressor;
import com.sparkymc.expansionmod.util.Reference;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockCompressor extends ModBlock implements ITileEntityProvider {

	public BlockCompressor(String name) {
		super(name, CreativeTabs.DECORATIONS, Material.ANVIL, "pickaxe", 2);
		
	}

	public BlockCompressor() {
		this("compressor");
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if(!worldIn.isRemote) {
			
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			
			if(tileEntity==null) tileEntity = createTileEntity(worldIn, state);
			if(tileEntity instanceof TileEntityCompressor) {
				playerIn.openGui(Main.instance, Reference.COMPRESSOR_GUI_ID, worldIn, MathHelper.floor(hitX), MathHelper.floor(hitY), MathHelper.floor(hitZ));
				return true;
			}
		}
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityCompressor();
	}
}
