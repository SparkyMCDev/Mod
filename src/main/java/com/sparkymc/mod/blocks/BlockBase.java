package com.sparkymc.mod.blocks;

import com.sparkymc.mod.Main;
import com.sparkymc.mod.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

public class BlockBase extends Block {
    public BlockBase(String name, Material material) {
        super(Block.Properties.create(material));
    }
}
