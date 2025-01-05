
package net.mcreator.dbm.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.dbm.procedures.KorinTowerBaseEntityCollidesInTheBlockProcedure;

public class PowerPolePlinthUpBlock extends Block {
	public PowerPolePlinthUpBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(-1, 3600000).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(6.95, 14.225, 6.9, 7.4, 16.225, 9.05), box(8.65, 14.225, 6.9, 9.1, 16.225, 9.05), box(8.65, 13.225, 7.15, 8.85, 14.225, 8.8), box(7.2, 13.225, 7.15, 7.4, 14.225, 8.8), box(6.9, 13.225, 7.85, 7.4, 16.225, 8.125),
				box(8.65, 13.225, 7.85, 9.15, 16.225, 8.125), box(7.8625, 13.225, 6.85, 8.1375, 16.225, 7.35), box(7.8625, 13.225, 8.6, 8.1375, 16.225, 9.1), box(7.8625, 14.825, 9.1, 8.1375, 16.225, 9.3), box(6.7, 14.825, 7.85, 6.9, 16.225, 8.125),
				box(9.15, 14.825, 7.85, 9.35, 16.225, 8.125), box(7.8625, 14.825, 6.65, 8.1375, 16.225, 6.85), box(7.4, 13.225, 8.6, 8.65, 14.225, 8.8), box(7.4, 13.225, 7.15, 8.65, 14.225, 7.35), box(7.4, 14.225, 8.6, 8.65, 16.225, 9.05),
				box(7.4, 14.225, 6.9, 8.65, 16.225, 7.35), box(6.65, 15.925, 6.6, 9.4, 16.225, 9.35));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		KorinTowerBaseEntityCollidesInTheBlockProcedure.execute(entity);
	}
}
