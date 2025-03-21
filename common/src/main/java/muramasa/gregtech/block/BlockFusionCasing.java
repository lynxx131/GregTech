package muramasa.gregtech.block;

import muramasa.antimatter.datagen.builder.AntimatterBlockModelBuilder;
import muramasa.antimatter.datagen.providers.AntimatterBlockStateProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nullable;

import static muramasa.antimatter.client.AntimatterModelManager.LOADER_DYNAMIC;

public class BlockFusionCasing extends BlockTurbineCasing {

    @Override
    protected String getTextureID() {
        return "fusion";
    }

    public BlockFusionCasing(String domain, String id) {
        super(domain, id);
    }

    @Override
    public boolean canConnect(BlockGetter world, BlockState state, @Nullable BlockEntity tile, BlockPos pos) {
        return state.getBlock() instanceof BlockFusionCasing;
    }

    //Default code for connected textures.
    @Override
    public AntimatterBlockModelBuilder buildBlock(Block block, AntimatterBlockStateProvider prov) {
        AntimatterBlockModelBuilder builder = super.buildBlock(block, prov);
        return builder.loader(LOADER_DYNAMIC).basicConfig(block, getConnectedTextures());
    }
}
