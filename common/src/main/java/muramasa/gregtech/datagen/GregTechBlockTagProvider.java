package muramasa.gregtech.datagen;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.data.AntimatterDefaultTools;
import muramasa.antimatter.datagen.providers.AntimatterBlockTagProvider;
import muramasa.gregtech.Ref;
import muramasa.gregtech.block.BlockCasing;
import muramasa.gregtech.block.BlockCoil;

public class GregTechBlockTagProvider extends AntimatterBlockTagProvider {

    public GregTechBlockTagProvider(String providerDomain, String providerName, boolean replace) {
        super(providerDomain, providerName, replace);
    }

    @Override
    public void processTags(String domain){
        super.processTags(domain);
        AntimatterAPI.all(BlockCasing.class, Ref.ID, cas -> {
            this.tag(AntimatterDefaultTools.WRENCH.getToolType()).add(cas);
        });
        AntimatterAPI.all(BlockCoil.class, Ref.ID, cas -> {
            this.tag(AntimatterDefaultTools.WRENCH.getToolType()).add(cas);
        });
    }
}
