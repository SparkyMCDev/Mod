package com.sparkymc.expansionmod.blocks.machines.compressor;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;

public class InventoryCompressor extends InventoryCrafting implements IInventory {

	public InventoryCompressor(Container eventHandlerIn) {
		super(eventHandlerIn, 3, 1);
	}

}
