package gay.beegirl.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GatewayPedestalBlock
extends Block {
    /*private static final VoxelShape SHAPE = VoxelShapes.union(VoxelShapes.union(
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
            Block.createCuboidShape(0.0,32.0, 0.0, 16.0, 40.0, 16.0)),
            Block.createCuboidShape(-8.0, 0.0, -8.0, 24.0, 8.0, 24.0));*/
    private static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    public GatewayPedestalBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
