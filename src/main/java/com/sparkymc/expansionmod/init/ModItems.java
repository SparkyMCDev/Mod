package com.sparkymc.expansionmod.init;

import java.util.ArrayList;
import java.util.List;

import com.sparkymc.expansionmod.items.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> items = new ArrayList<Item>();
	
	public static final Item copper_ingot = new ModItem("copper_ingot", CreativeTabs.MATERIALS);
	public static final Item tin_ingot = new ModItem("tin_ingot", CreativeTabs.MATERIALS);
	public static final Item bronze_ingot = new ModItem("bronze_ingot", CreativeTabs.MATERIALS);
	
	public static final Item wire = new ModItem("wire", CreativeTabs.MATERIALS);
	public static final Item wire_coil = new ModItem("wire_coil", CreativeTabs.MATERIALS);
	
	public static final Item iron_plate = new ModItem("iron_plate", CreativeTabs.MATERIALS);
}
