package com.sparkymc.expansionmod.util.handlers;

import com.sparkymc.expansionmod.init.ModBlocks;
import com.sparkymc.expansionmod.init.ModItems;
import com.sparkymc.expansionmod.util.interfaces.IModdedModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.items.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.blocks.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.items) {
			if(item instanceof IModdedModel) {
				((IModdedModel)item).registerModels();
			}
		}
		for(Block block : ModBlocks.blocks) {
			if(block instanceof IModdedModel) {
				((IModdedModel)block).registerModels();
			}
		}
	}
	
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	public static void init(FMLInitializationEvent event) {
		
	}
	
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
