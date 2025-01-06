
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

public class VerticalLadderBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public VerticalLadderBlock() {
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
			default -> Shapes.or(box(14, 0, 14, 16, 16, 16), box(0, 0, 14, 2, 16, 16), box(2, 13.5, 14.25, 14, 15, 15.75), box(2, 1, 14.25, 14, 2.5, 15.75), box(2, 10.35, 14.25, 14, 11.85, 15.75), box(2, 4.15, 14.25, 14, 5.65, 15.75),
					box(2, 7.25, 14.25, 14, 8.75, 15.75), box(2, 0, 14.05, 14, 16, 16));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 16, 2), box(14, 0, 0, 16, 16, 2), box(2, 13.5, 0.25, 14, 15, 1.75), box(2, 1, 0.25, 14, 2.5, 1.75), box(2, 10.35, 0.25, 14, 11.85, 1.75), box(2, 4.15, 0.25, 14, 5.65, 1.75),
					box(2, 7.25, 0.25, 14, 8.75, 1.75), box(2, 0, 0, 14, 16, 1.95));
			case EAST -> Shapes.or(box(14, 0, 0, 16, 16, 2), box(14, 0, 14, 16, 16, 16), box(14.25, 13.5, 2, 15.75, 15, 14), box(14.25, 1, 2, 15.75, 2.5, 14), box(14.25, 10.35, 2, 15.75, 11.85, 14), box(14.25, 4.15, 2, 15.75, 5.65, 14),
					box(14.25, 7.25, 2, 15.75, 8.75, 14), box(14.05, 0, 2, 16, 16, 14));
			case WEST -> Shapes.or(box(0, 0, 14, 2, 16, 16), box(0, 0, 0, 2, 16, 2), box(0.25, 13.5, 2, 1.75, 15, 14), box(0.25, 1, 2, 1.75, 2.5, 14), box(0.25, 10.35, 2, 1.75, 11.85, 14), box(0.25, 4.15, 2, 1.75, 5.65, 14),
					box(0.25, 7.25, 2, 1.75, 8.75, 14), box(0, 0, 2, 1.95, 16, 14));
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
