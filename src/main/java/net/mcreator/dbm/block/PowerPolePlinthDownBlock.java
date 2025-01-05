
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

public class PowerPolePlinthDownBlock extends Block {
	public PowerPolePlinthDownBlock() {
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
		return Shapes.or(box(6.95, 0, 6.9, 7.4, 2, 9.05), box(8.65, 0, 6.9, 9.1, 2, 9.05), box(8.65, 2, 7.15, 8.85, 3, 8.8), box(7.2, 2, 7.15, 7.4, 3, 8.8), box(6.9, 0, 7.85, 7.4, 3, 8.125), box(8.65, 0, 7.85, 9.15, 3, 8.125),
				box(7.8625, 0, 6.85, 8.1375, 3, 7.35), box(7.8625, 0, 8.6, 8.1375, 3, 9.1), box(7.8625, 0, 9.1, 8.1375, 1.4, 9.3), box(6.7, 0, 7.85, 6.9, 1.4, 8.125), box(9.15, 0, 7.85, 9.35, 1.4, 8.125), box(7.8625, 0, 6.65, 8.1375, 1.4, 6.85),
				box(7.4, 2, 8.6, 8.65, 3, 8.8), box(7.4, 2, 7.15, 8.65, 3, 7.35), box(7.4, 0, 8.6, 8.65, 2, 9.05), box(7.4, 0, 6.9, 8.65, 2, 7.35), box(6.65, 0, 6.6, 9.4, 0.3, 9.35));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		KorinTowerBaseEntityCollidesInTheBlockProcedure.execute(entity);
	}
}
