package muramasa.gregtech.loader.machines.generator;

import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import net.minecraft.world.item.Items;

import static muramasa.antimatter.data.AntimatterMaterialTypes.DUST;
import static muramasa.antimatter.data.AntimatterMaterialTypes.GEM;
import static muramasa.gregtech.data.Materials.*;
import static muramasa.gregtech.data.RecipeMaps.COAL_BOILERS;

public class CoalBoilerHandler {
    public static void init(){
        COAL_BOILERS.RB().ii(RecipeIngredient.of(Items.COAL, 1)).io(DUST.get(DarkAsh, 1)).add(160);
        COAL_BOILERS.RB().ii(RecipeIngredient.of(Items.CHARCOAL, 1)).io(DUST.get(Ash, 1)).add(160);
        COAL_BOILERS.RB().ii(RecipeIngredient.of(GEM.get(CoalCoke), 1)).io(DUST.get(DarkAsh, 1)).add(320);
    }
}
