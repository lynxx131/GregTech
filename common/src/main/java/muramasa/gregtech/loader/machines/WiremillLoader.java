package muramasa.gregtech.loader.machines;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.data.AntimatterMaterialTypes;
import muramasa.antimatter.pipe.PipeSize;
import muramasa.antimatter.pipe.types.Wire;
import muramasa.antimatter.recipe.ingredient.RecipeIngredient;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static muramasa.gregtech.data.RecipeMaps.WIRE_MILLING;

public class WiremillLoader {
    public static void init() {
        AntimatterAPI.all(Wire.class).forEach(t -> {
            Item wireItem = t.getBlockItem(PipeSize.VTINY);
            ItemStack stack = new ItemStack(wireItem,2);
            RecipeIngredient ing = t.getMaterial().has(AntimatterMaterialTypes.INGOT) ? AntimatterMaterialTypes.INGOT.getMaterialIngredient(t.getMaterial(),1) : AntimatterMaterialTypes.DUST.getMaterialIngredient(t.getMaterial(),1);
            WIRE_MILLING.RB().ii(ing).io(stack).add(t.getMaterial().getMass()*2,24);
            if (AntimatterMaterialTypes.WIRE_FINE.allowItemGen(t.getMaterial())) {
                WIRE_MILLING.RB().ii(RecipeIngredient.of(wireItem,1)).io(AntimatterMaterialTypes.WIRE_FINE.get(t.getMaterial(),4)).add((long)( t.getMaterial().getMass()*2.5),16);
            }
        });

    }
}
