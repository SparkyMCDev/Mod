package com.sparkymc.expansionmod.blocks;

import com.sparkymc.expansionmod.Main;
import com.sparkymc.expansionmod.init.ModBlocks;
import com.sparkymc.expansionmod.init.ModItems;
import com.sparkymc.expansionmod.util.interfaces.IModdedModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModBlock extends Block implements IModdedModel {
	public ModBlock(String name, CreativeTabs tab, Material material, String harvestToolType, int harvestLevel) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setResistance(6);
		setHarvestLevel(harvestToolType, harvestLevel);
		setHardness(7f);
		
		ModBlocks.blocks.add(this);
		ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
