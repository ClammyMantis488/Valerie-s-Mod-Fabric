package net.val.mod.content;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.val.mod.blocks.Misc.BeadBlock;

public class Misc {

    public static BeadBlock BEAD_TEST;

    public static void init() {
        BEAD_TEST = new BeadBlock("bead_test");
    }
}
