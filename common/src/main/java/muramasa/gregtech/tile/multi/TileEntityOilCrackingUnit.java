package muramasa.gregtech.tile.multi;

import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.tile.multi.TileEntityMultiMachine;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TileEntityOilCrackingUnit extends TileEntityMultiMachine<TileEntityOilCrackingUnit> {

    public TileEntityOilCrackingUnit(Machine<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
