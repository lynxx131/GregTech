package muramasa.gregtech.cover;

import com.google.common.collect.ImmutableMap;
import muramasa.antimatter.capability.ICoverHandler;
import muramasa.antimatter.cover.BaseCover;
import muramasa.antimatter.cover.CoverFactory;
import muramasa.antimatter.machine.Tier;
import muramasa.antimatter.util.Utils;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import tesseract.TesseractCapUtils;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class CoverPump extends BaseCover {

    public static String ID = "pump";

    public static final Map<Tier, Integer> speeds = ImmutableMap.<Tier, Integer>builder().
            put(Tier.LV, 640 / 20)
            .put(Tier.MV, 2560 / 20)
            .put(Tier.HV, 10240 / 20)
            .put(Tier.EV, 4096010 / 20)
            .put(Tier.IV, 163840 / 20).build();

    public CoverPump(ICoverHandler<?> source, @Nullable Tier tier, Direction side, CoverFactory factory) {
        super(source, tier, side, factory);
        Objects.requireNonNull(tier);
    }

    @Override
    public ResourceLocation getModel(String type, Direction dir) {
        if (type.equals("pipe")) return PIPE_COVER_MODEL;
        return getBasicDepthModel();
    }

    @Override
    public <T> boolean blocksCapability(Class<T> cap, Direction side) {
        return side == null && cap != IFluidHandler.class;
    }

    @Override
    public void onUpdate() {
        //Pump acts on each tick.
        if (handler.getTile().getLevel().isClientSide) return;
        BlockEntity adjTile = handler.getTile().getLevel().getBlockEntity(handler.getTile().getBlockPos().relative(side));
        if (adjTile == null) return;
        Optional<IFluidHandler> handler = TesseractCapUtils.getFluidHandler(adjTile, side.getOpposite());
        if (handler.isEmpty()) return;
        TesseractCapUtils.getFluidHandler(this.handler.getTile(), side).ifPresent(ih -> handler.ifPresent(other -> Utils.transferFluids(ih, other, speeds.get(tier))));
    }
}
