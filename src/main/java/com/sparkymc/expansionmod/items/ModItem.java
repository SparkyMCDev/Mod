package com.sparkymc.expansionmod.items;

import com.sparkymc.expansionmod.Main;
import com.sparkymc.expansionmod.init.ModItems;
import com.sparkymc.expansionmod.util.interfaces.IModdedModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item implements IModdedModel {
	public ModItem(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.items.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
}
