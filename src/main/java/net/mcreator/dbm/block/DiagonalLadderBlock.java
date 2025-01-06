
package net.mcreator.dbm.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.procedures.KorinTowerBaseEntityCollidesInTheBlockProcedure;
import net.mcreator.dbm.procedures.HorizontalLadderSupportBlockDestroyedByPlayerProcedure;
import net.mcreator.dbm.procedures.HorizontalLadderSupportBlockAddedProcedure;

public class DiagonalLadderBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DiagonalLadderBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(-1, 3600000).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 1.95, 2), box(0, 2, 2, 16, 3.95, 4), box(0, 4, 4, 16, 5.95, 6), box(0, 6, 6, 16, 7.95, 8), box(0, 8, 8, 16, 9.95, 10), box(0, 10, 10, 16, 11.95, 12), box(0, 12, 12, 16, 13.95, 14),
					box(0, 14, 14, 16, 15.95, 16));
			case NORTH -> Shapes.or(box(0, 0, 14, 16, 1.95, 16), box(0, 2, 12, 16, 3.95, 14), box(0, 4, 10, 16, 5.95, 12), box(0, 6, 8, 16, 7.95, 10), box(0, 8, 6, 16, 9.95, 8), box(0, 10, 4, 16, 11.95, 6), box(0, 12, 2, 16, 13.95, 4),
					box(0, 14, 0, 16, 15.95, 2));
			case EAST -> Shapes.or(box(0, 0, 0, 2, 1.95, 16), box(2, 2, 0, 4, 3.95, 16), box(4, 4, 0, 6, 5.95, 16), box(6, 6, 0, 8, 7.95, 16), box(8, 8, 0, 10, 9.95, 16), box(10, 10, 0, 12, 11.95, 16), box(12, 12, 0, 14, 13.95, 16),
					box(14, 14, 0, 16, 15.95, 16));
			case WEST -> Shapes.or(box(14, 0, 0, 16, 1.95, 16), box(12, 2, 0, 14, 3.95, 16), box(10, 4, 0, 12, 5.95, 16), box(8, 6, 0, 10, 7.95, 16), box(6, 8, 0, 8, 9.95, 16), box(4, 10, 0, 6, 11.95, 16), box(2, 12, 0, 4, 13.95, 16),
					box(0, 14, 0, 2, 15.95, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		HorizontalLadderSupportBlockAddedProcedure.execute();
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		HorizontalLadderSupportBlockDestroyedByPlayerProcedure.execute();
		return retval;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		KorinTowerBaseEntityCollidesInTheBlockProcedure.execute(entity);
	}
}
