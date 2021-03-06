package com.teamabnormals.abnormals_core.common.blocks;

import com.teamabnormals.abnormals_core.core.util.ItemStackUtil;

import net.minecraft.block.TallFlowerBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class AbnormalsTallFlowerBlock extends TallFlowerBlock {

	public AbnormalsTallFlowerBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStackUtil.fillAfterItemForGroup(this.asItem(), Items.PEONY, group, items);
	}

}
