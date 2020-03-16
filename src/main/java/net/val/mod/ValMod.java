package net.val.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.val.mod.content.Misc;

public class ValMod implements ModInitializer {

	public static final String MOD_ID = "val";
	public static final ItemGroup VALSMOD_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "valsmod_blocks"), () -> new ItemStack(Blocks.DIRT));

	@Override
	public void onInitialize() {
		Misc.init();
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
				Misc.BEAD_TEST);
	}
}
