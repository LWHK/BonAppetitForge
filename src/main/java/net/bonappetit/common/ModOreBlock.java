package net.bonappetit.common;

import java.util.Random;

import net.bonappetit.register.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class ModOreBlock extends Block {
    
    public ModOreBlock(Properties properties) {
        super(properties);
    }

    protected int getExperience(Random random) {
        if (this == ModBlocks.HALITE_ORE.get()) {
            return MathHelper.nextInt(random, 0, 1);
        } else {
            return 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}
