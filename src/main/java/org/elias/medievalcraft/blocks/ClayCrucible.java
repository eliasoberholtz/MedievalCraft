package org.elias.medievalcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ClayCrucible extends Block {

    public ClayCrucible(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        double outlineMin = 0.2;
        double outlineMaxChange = 0.3;

        return VoxelShapes.cuboid(0.1, 0, 0.2, 0.65, 0.5, 0.6);
    }
}
