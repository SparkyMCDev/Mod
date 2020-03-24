package com.sparkymc.expansionmod.blocks.machines.compressor;

import com.sparkymc.expansionmod.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerCompressor extends Container {
	
	public ContainerCompressor() {
		this.windowId = Reference.COMPRESSOR_GUI_ID;
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return true;
	}
	
	private void generateInventory() {
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 9; x++) {
				addSlotToContainer(new Slot(Minecraft.getMinecraft().player.inventory, y*9+x, x+(x*2)+8, y+(y*2)+84));
			}
		}
	}
}
