package com.sparkymc.expansionmod.init;

import java.util.ArrayList;
import java.util.List;

import com.sparkymc.expansionmod.blocks.BlockCompressor;
import com.sparkymc.expansionmod.blocks.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static final List<Block> blocks = new ArrayList<Block>();
	
	public static final Block copper_block = new ModBlock("copper_block", CreativeTabs.BUILDING_BLOCKS, Material.IRON, "pickaxe", 2);
	public static final Block tin_block = new ModBlock("tin_block", CreativeTabs.BUILDING_BLOCKS, Material.IRON, "pickaxe", 2);
	public static final Block bronze_block = new ModBlock("bronze_block", CreativeTabs.BUILDING_BLOCKS, Material.IRON, "pickaxe", 2);
	
	public static final Block compressor = new BlockCompressor("compressor");
}
