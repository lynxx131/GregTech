package muramasa.gregtech.loader.machines;

import com.github.gregtechintergalactical.gtrubber.GTRubberData;
import net.minecraft.world.item.ItemStack;

import static muramasa.antimatter.data.AntimatterMaterialTypes.DUST;
import static muramasa.antimatter.recipe.ingredient.RecipeIngredient.of;
import static muramasa.gregtech.data.Materials.RawRubber;
import static muramasa.gregtech.data.RecipeMaps.EXTRACTING;

public class ExtractorLoader {
    public static void init() {
        EXTRACTING.RB().ii(of(GTRubberData.RUBBER_LOG.asItem(),1)).io(new ItemStack(DUST.get(RawRubber),2)).add(200,8);
        EXTRACTING.RB().ii(of(GTRubberData.RUBBER_LEAVES.asItem(),1)).io(new ItemStack(DUST.get(RawRubber))).add(150,8);
        EXTRACTING.RB().ii(of(GTRubberData.RUBBER_SAPLING.asItem(),1)).io(new ItemStack(DUST.get(RawRubber))).add(150,8);
        EXTRACTING.RB().ii(of(GTRubberData.StickyResin,1)).io(new ItemStack(DUST.get(RawRubber),4)).add(200,5);
    }
}
