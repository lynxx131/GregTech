package muramasa.gregtech.data;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.Data;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.material.MaterialTags;
import muramasa.antimatter.material.SubTag;
import muramasa.antimatter.material.TextureSet;
import muramasa.gregtech.Ref;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;

import static com.google.common.collect.ImmutableMap.of;
import static muramasa.antimatter.Data.*;
import static muramasa.antimatter.material.Element.*;
import static muramasa.antimatter.material.MaterialTags.CHEMBATH_MERCURY;
import static muramasa.antimatter.material.MaterialTags.CHEMBATH_PERSULFATE;
import static muramasa.antimatter.material.TextureSet.*;

public class Materials {

    public static Material Aluminium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "aluminium", 0x80c8f0, DULL, Al));
    public static Material Beryllium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "beryllium", 0x64b464, METALLIC, Be));
    public static Material Bismuth = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bismuth", 0x64a0a0, METALLIC, Bi));
    public static Material Carbon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "carbon", 0x141414, DULL, C)); // TODO: Tools,
                                                                                                    // Carbon
    // Fluid? Removed Tool;
    public static Material Chrome = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chrome", 0xffe6e6, SHINY, Cr));
    public static Material Cobalt = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cobalt", 0x5050fa, METALLIC, Co));
    public static Material Iridium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "iridium", 0xf0f0f5, DULL, Ir));
    public static Material Lanthanum = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lanthanum", 0xffffff, METALLIC, La));
    public static Material Lead = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lead", 0x8c648c, DULL, Pb));
    public static Material Manganese = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "manganese", 0xfafafa, DULL, Mn));
    public static Material Molybdenum = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "molybdenum", 0xb4b4dc, SHINY, Mo));
    public static Material Neodymium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "neodymium", 0x646464, METALLIC, Nd)); // TODO: Bastnasite or Monazite for Ore For;
    public static Material Neutronium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "neutronium", 0xfafafa, DULL, Nt)); // TODO Vibraniu;
    public static Material Nickel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nickel", 0xc8c8fa, METALLIC, Ni));
    public static Material Osmium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "osmium", 0x3232ff, METALLIC, Os));
    public static Material Palladium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "palladium", 0x808080, SHINY, Pd));
    public static Material Platinum = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "platinum", 0xffffc8, SHINY, Pt));
    public static Material Plutonium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "plutonium_244", 0xf03232, METALLIC, Pu)); // TODO: Enchantment: Radioactivit;
    public static Material Plutonium241 = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "plutonium_241", 0xfa4646, SHINY, Pu241));
    public static Material Silver = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "silver", 0xdcdcff, SHINY, Ag));
    public static Material Thorium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "thorium", 0x001e00, SHINY, Th));
    public static Material Titanium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "titanium", 0xdca0f0, METALLIC, Ti));
    public static Material Tungsten = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tungsten", 0x323232, METALLIC, W)); // Tungstensteel would be the one with tool;
    public static Material Uranium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uranium_238", 0x32f032, METALLIC, U));
    public static Material Uranium235 = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uranium_235", 0x46fa46, METALLIC, U235));
    public static Material Graphite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "graphite", 0x808080, DULL));
    public static Material Americium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "americium", 0xc8c8c8, METALLIC, Am)); // TODO:
    public static Material Antimony = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "antimony", 0xdcdcf0, SHINY, Sb));
    public static Material Argon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "argon", 0xff00f0, NONE, Ar));
    public static Material Arsenic = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "arsenic", 0xffffff, DULL, As));
    public static Material Barium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "barium", 0xffffff, METALLIC, Ba));
    public static Material Boron = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "boron", 0xfafafa, DULL, B));
    public static Material Caesium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "caesium", 0xffffff, METALLIC, Cs));
    public static Material Calcium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "calcium", 0xfff5f5, METALLIC, Ca));
    public static Material Cadmium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cadmium", 0x32323c, SHINY, Cd));
    public static Material Cerium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cerium", 0xffffff, METALLIC, Ce));
    public static Material Chlorine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chlorine", 0x00ffff, NONE, Cl));
    public static Material Deuterium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "deuterium", 0xffff00, NONE, D));
    public static Material Dysprosium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dysprosium", 0xffffff, METALLIC, D));
    public static Material Europium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "europium", 0xffffff, METALLIC, Eu));
    public static Material Fluorine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "fluorine", 0xffffff, NONE, F));
    public static Material Gallium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "gallium", 0xdcdcff, SHINY, Ga));
    public static Material Hydrogen = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydrogen", 0x0000ff, NONE, H));
    public static Material Helium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "helium", 0xffff00, NONE, He));
    public static Material Helium3 = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "helium_3", 0xffffff, NONE, He_3));
    public static Material Indium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "indium", 0x400080, METALLIC, In));
    public static Material Lithium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lithium", 0xe1dcff, DULL, Li));
    public static Material Lutetium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lutetium", 0xffffff, DULL, Lu));
    public static Material Magnesium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnesium", 0xffc8c8, METALLIC, Mg));
    public static Material Mercury = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "mercury", 0xffdcdc, SHINY, Hg));
    public static Material Neon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "neon", 0xffff00, NONE, Ne));
    public static Material Niobium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "niobium", 0xbeb4c8, METALLIC, Nb));
    public static Material Nitrogen = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nitrogen", 0x0096c8, NONE, N));
    public static Material Oxygen = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "oxygen", 0x0064c8, NONE, O));
    public static Material Phosphor = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phosphor", 0xffff00, DULL, P));
    public static Material Potassium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "potassium", 0xfafafa, METALLIC, K));
    public static Material Radon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "radon", 0xff00ff, NONE, Rn));
    public static Material Silicon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "silicon", 0x3c3c50, METALLIC, Si));
    public static Material Sodium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium", 0x000096, METALLIC, Na));
    public static Material Sulfur = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfur", 0xc8c800, DULL, S));
    public static Material Tantalum = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tantalum", 0xffffff, METALLIC, Ta));
    public static Material Tin = AntimatterAPI.register(Material.class, new Material(Ref.ID, "tin", 0xdcdcdc, DULL, Sn))
            ;
    public static Material Tritium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tritium", 0xff0000, METALLIC, T));
    public static Material Vanadium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vanadium", 0x323232, METALLIC, V));
    public static Material Xenon = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "xenon", 0xffff00, NONE, Xe));
    public static Material Yttrium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "yttrium", 0xdcfadc, METALLIC, Y));
    public static Material Zinc = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "zinc", 0xfaf0f0, METALLIC, Zn));

    // TODO: We can be more lenient about what fluids we have in, its not as bad as
    // solids above, and we can stop them from showing in JEI (I think...)

    /**
     * Gases
     **/
    public static Material WoodGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "wood_gas", 0xdecd87, NONE));
    public static Material Methane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "methane", 0xffffff, NONE));
    public static Material CarbonDioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "carbon_dioxide", 0xa9d0f5, NONE));
    public static Material NobleGases = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "noble_gases", 0xc9e3fc, NONE));
    public static Material Air = AntimatterAPI.register(Material.class, new Material(Ref.ID, "air", 0xc9e3fc, NONE));
    public static Material NitrogenDioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nitrogen_dioxide", 0x64afff, NONE));
    public static Material NaturalGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "natural_gas", 0xffffff, NONE));
    public static Material SulfuricGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_gas", 0xffffff, NONE));
    public static Material RefineryGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "refinery_gas", 0xffffff, NONE));
    public static Material LPG = AntimatterAPI.register(Material.class, new Material(Ref.ID, "lpg", 0xffff00, NONE));
    public static Material Ethane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethane", 0xc8c8ff, NONE));
    public static Material Propane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "propane", 0xfae250, NONE));
    public static Material Butane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butane", 0xb6371e, NONE));
    public static Material Butene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butene", 0xcf5005, NONE));
    public static Material Butadiene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butadiene", 0xe86900, NONE));
    public static Material VinylChloride = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vinyl_chloride", 0xfff0f0, NONE));
    public static Material SulfurDioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfur_dioxide", 0xc8c819, NONE));
    public static Material SulfurTrioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfur_trioxide", 0xa0a014, NONE))
            /* .setTemp(344, 1) */;
    public static Material Dimethylamine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dimethylamine", 0x554469, NONE));
    public static Material DinitrogenTetroxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dinitrogen_tetroxide", 0x004184, NONE));
    public static Material NitricOxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nitric_oxide", 0x7dc8f0, NONE));
    public static Material Ammonia = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ammonia", 0x3f3480, NONE));
    public static Material Chloromethane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chloromethane", 0xc82ca0, NONE));
    public static Material Tetrafluoroethylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tetrafluoroethylene", 0x7d7d7d, NONE));
    public static Material CarbonMonoxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "carbon_monoxide", 0x0e4880, NONE));
    public static Material Ethylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethylene", 0xe1e1e1, NONE));
    public static Material Propene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "propene", 0xffdd55, NONE));
    public static Material Ethenone = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethenone", 0x141446, NONE));
    public static Material HydrogenSulfide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydrogen_sulfide", 0xffffff, NONE));

    /**
     * Fluids
     **/
    public static Material Steam = AntimatterAPI.register(Material.class, new Material(Ref.ID, "steam", 0xa0a0a0, NONE));
    public static Material SaltWater = AntimatterAPI.register(Material.class, new Material(Ref.ID, "salt_water", 0x0760b9, NONE));
    public static Material UUAmplifier = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uu_amplifier", 0x600080, NONE));
    public static Material UUMatter = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uu_matter", 0x8000c4, NONE));
    public static Material Antimatter = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "anti_matter", 0x8000c4, NONE));
    public static Material CharcoalByproducts = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "charcoal_byproducts", 0x784421, NONE));
    public static Material Glue = AntimatterAPI.register(Material.class, new Material(Ref.ID, "glue", 0xc8c400, NONE));
    public static Material Honey = AntimatterAPI.register(Material.class, new Material(Ref.ID, "honey", 0xd2c800, NONE)); // TODO: Only when Forestry's present;
    public static Material Lubricant = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lubricant", 0xffc400, NONE));
    public static Material WoodTar = AntimatterAPI.register(Material.class, new Material(Ref.ID, "wood_tar", 0x28170b, NONE));
    public static Material WoodVinegar = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "wood_vinegar", 0xd45500, NONE));
    public static Material LiquidAir = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "liquid_air", 0xa9d0f5, NONE));// TODO Rrename to
                                                                                                     // liquid
    // oxygen <- Nope, add
    // fluid to Oxyge;
    public static Material DistilledWater = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "distilled_water", 0x5C5CFF, NONE));
    public static Material Glyceryl = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "glyceryl", 0x009696, NONE));
    public static Material Titaniumtetrachloride = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "titaniumtetrachloride", 0xd40d5c, NONE));
    public static Material SodiumPersulfate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium_persulfate", 0xffffff, NONE));
    public static Material DilutedHydrochloricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "diluted_hydrochloric_acid", 0x99a7a3, NONE));
    public static Material SulfuricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_acid", 0xff8000, NONE));
    public static Material NitricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nitric_acid", 0xe6e2ab, NONE));
    public static Material NitrationMixture = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nitration_mixture", 0xe6e2ab, NONE));
    public static Material Dichlorobenzene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dichlorobenzene", 0x004455, NONE));
    public static Material Styrene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "styrene", 0xd2c8be, NONE));
    public static Material Isoprene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "isoprene", 0x141414, NONE));
    public static Material Tetranitromethane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tetranitromethane", 0x0f2828, NONE));
    public static Material Epichlorohydrin = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "epichlorohydrin", 0x501d05, NONE));
    public static Material Dimethylhydrazine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dimethylhydrazine", 0x000055, NONE));
    public static Material Chloramine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chloramine", 0x3f9f80, NONE));
    public static Material Dimethyldichlorosilane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dimethyldichlorosilane", 0x441650, NONE));
    public static Material HydrofluoricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydrofluoric_acid", 0x0088aa, NONE));
    public static Material Chloroform = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chloroform", 0x892ca0, NONE));
    public static Material BisphenolA = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bisphenol_a", 0xd4b300, NONE));
    public static Material AceticAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "acetic_acid", 0xc8b4a0, NONE));
    // public static Material CalciumAcetateSolution =
    // AntimatterAPI.register(Material.class, new Material(Ref.ID,
    // "calcium_acetate_solution", 0xdcc8b4,
    // RUBY)).addComposition(of(Calcium, 1, Carbon, 2, Oxygen, 4,
    // Hydrogen, 6);
    public static Material Acetone = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "acetone", 0xafafaf, NONE));
    public static Material Methanol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "methanol", 0xaa8800, NONE));
    public static Material VinylAcetate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vinyl_acetate", 0xffb380, NONE));
    public static Material PolyvinylAcetate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polyvinyl_acetate", 0xff9955, NONE));
    public static Material MethylAcetate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "methyl_acetate", 0xeec6af, NONE));
    public static Material AllylChloride = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "allyl_chloride", 0x87deaa, NONE));
    public static Material HydrochloricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydrochloric_acid", 0x6f8a91, NONE));
    public static Material HypochlorousAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hypochlorous_acid", 0x6f8a91, NONE));
    public static Material Cumene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cumene", 0x552200, NONE));
    public static Material PhosphoricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phosphoric_acid", 0xdcdc00, NONE));
    public static Material SulfuricTrioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_trioxide", 0x8d8d21, NONE));
    public static Material SulfuricDioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_dioxide", 0x8d8d27, NONE));
    public static Material DilutedSulfuricAcid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "diluted_sulfuric_acid", 0xc07820, NONE));
    public static Material Benzene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "benzene", 0x1a1a1a, NONE));
    public static Material Phenol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phenol", 0x784421, NONE));
    public static Material Toluene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "toluene", 0x501d05, NONE));
    public static Material SulfuricNaphtha = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_naphtha", 0xffff00, NONE));
    public static Material Naphtha = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "naphtha", 0xffff00, NONE));
    public static Material DrillingFluid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "drilling_fluid", 0xffffff, NONE)); // TODO:
                                                                                                         // Perhaps for
    // a bedrock drill;
    public static Material BlueVitriol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "blue_vitriol_water_solution", 0xffffff, NONE));
    public static Material IndiumConcentrate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "indium_concentrate", 0xffffff, NONE));
    public static Material NickelSulfate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nickel_sulfate", 0xffffff, NONE));
    public static Material RocketFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rocket_fuel", 0xffffff, NONE));
    public static Material LeadZincSolution = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lead_zinc_solution", 0xffffff, NONE));

    /**
     * Fuels
     **/
    public static Material Diesel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "diesel", 0xffff00, NONE));
    public static Material NitroFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cetane_boosted_diesel", 0xc8ff00, NONE));
    public static Material BioDiesel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bio_diesel", 0xff8000, NONE));
    public static Material Biomass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "biomass", 0x00ff00, NONE));
    public static Material FermentedBiomass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "fermented_biomass", 0x09964a, NONE));
    public static Material Ethanol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethanol", 0xff8000, NONE));
    public static Material Ethanediol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethanediol", 0xff8000, NONE));
    public static Material Propanol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "propanol", 0xff8000, NONE));
    public static Material Ethenol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ethenol", 0xff8000, NONE));
    public static Material Propanediol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "propanediol", 0xff8000, NONE));
    public static Material Propenol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "propenol", 0xff8000, NONE));
    public static Material Butanol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butanol", 0xff8000, NONE));
    public static Material Butenol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butenol", 0xff8000, NONE));
    public static Material Butanediol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "butanediol", 0xff8000, NONE));
    public static Material Heptanol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "heptanol", 0xff8000, NONE));
    public static Material Creosote = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "creosote", 0x804000, NONE));
    public static Material FishOil = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "fish_oil", 0xffc400, NONE));
    public static Material Oil = AntimatterAPI.register(Material.class, new Material(Ref.ID, "oil", 0x0a0a0a, NONE));
    public static Material SeedOil = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "seed_oil", 0xc4ff00, NONE));
    // public static Materials SeedOilHemp = new Materials(722, "Hemp Seed Oil",
    // 196, 255, 0, lime, NONE).asSemi(2;
    // public static Materials SeedOilLin = new Materials(723, "Lin Seed Oil", 196,
    // 255, 0, lime, NONE).asSemi(2;
    // public static Material OilExtraHeavy = AntimatterAPI.register(Material.class,
    // new Material(Ref.ID, "extra_heavy_oil", 0x0a0a0a, NONE));
    public static Material OilHeavy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "heavy_oil", 0x0a0a0a, NONE));
    public static Material OilMedium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "raw_oil", 0x0a0a0a, NONE));
    public static Material OilLight = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "light_oil", 0x0a0a0a, NONE));
    public static Material SulfuricLightFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_light_diesel", 0xffff00, NONE));
    public static Material SulfuricHeavyFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sulfuric_heavy_diesel", 0xffff00, NONE));
    public static Material LightFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "light_diesel", 0xffff00, NONE));
    public static Material HeavyFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "heavy_diesel", 0xffff00, NONE));
    public static Material Glycerol = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "glycerol", 0x87de87, NONE));

    /**
     * Dusts
     **/
    public static Material WoodPulp = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "wood_pulp", 0x3f2620, NONE));
    public static Material SodiumSulfide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium_sulfide", 0xffe680, NONE));
    public static Material TinAlloy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tin_alloy", 0x9fadbb, NONE));
    public static Material Energium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "energium", 0xe81e21, NONE));
    public static Material BorosilicateGlass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "borosilicate_glass", 0xfafafa, NONE));
    public static Material IridiumSodiumOxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "iridium_sodium_oxide", 0xffffff, NONE));
    public static Material IndiumGalliumPhosphide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "indium_gallium_phosphide", 0x570b79, NONE));
    public static Material PlatinumGroupSludge = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "platinum_group_sludge", 0x001e00, NONE));
    public static Material Graphene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "graphene", 0x808080, DULL));
    public static Material Oilsands = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "oilsands", 0x0a0a0a, NONE));
    public static Material RareEarth = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rare_earth", 0x808064, FINE));
    public static Material Almandine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "almandine", 0xff0000, ROUGH));
    public static Material Andradite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "andradite", 0x967800, ROUGH));
    public static Material Ash = AntimatterAPI.register(Material.class, new Material(Ref.ID, "ash", 0x969696, DULL));
    public static Material BandedIron = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "banded_iron", 0x915a5a, DULL));
    public static Material BrownLimonite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "brown_limonite", 0xc86400, METALLIC));
    public static Material Calcite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "calcite", 0xfae6dc, DULL));
    public static Material Cassiterite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cassiterite", 0xdcdcdc, METALLIC));
    public static Material Chalcopyrite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "chalcopyrite", 0xa07828, DULL));
    public static Material Clay = AntimatterAPI.register(Material.class, new Material(Ref.ID, "clay", 0xc8c8dc, ROUGH));
    public static Material Cobaltite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cobaltite", 0x5050fa, METALLIC));
    public static Material Cooperite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cooperite", 0xffffc8, METALLIC));
    public static Material DarkAsh = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dark_ash", 0x323232, DULL));
    public static Material Galena = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "galena", 0x643c64, DULL));
    public static Material Garnierite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "garnierite", 0x32c846, METALLIC));
    public static Material Grossular = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "grossular", 0xc86400, ROUGH));
    public static Material Ilmenite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ilmenite", 0x463732, METALLIC));
    public static Material Rutile = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rutile", 0xd40d5c, GEM_H));
    public static Material MagnesiumChloride = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnesiumchloride", 0xd40d5c, DULL));
    public static Material Magnesite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnesite", 0xfafab4, METALLIC));
    public static Material Magnetite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnetite", 0x1e1e1e, METALLIC));
    public static Material Molybdenite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "molybdenite", 0x91919, METALLIC));
    public static Material Obsidian = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "obsidian", 0x503264, DULL));
    public static Material Phosphate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phosphate", 0xffff00, DULL));
    public static Material Polydimethylsiloxane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polydimethylsiloxane", 0xf5f5f5, NONE));
    // public static Material Powellite = AntimatterAPI.register(Material.class, new
    // Material(Ref.ID, "powellite", 0xffff00,
    // DULL));
    public static Material Pyrite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "pyrite", 0x967828, ROUGH));
    public static Material Pyrolusite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "pyrolusite", 0x9696aa, DULL));
    public static Material Pyrope = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "pyrope", 0x783264, METALLIC));
    public static Material RawRubber = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "raw_rubber", 0xccc789, DULL));
    public static Material Saltpeter = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "saltpeter", 0xe6e6e6, FINE));
    public static Material Scheelite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "scheelite", 0xc88c14, DULL));
    public static Material SiliconDioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "silicon_dioxide", 0xc8c8c8, QUARTZ));
    // public static Material Pyrochlore = AntimatterAPI.register(Material.class,
    // new Material(Ref.ID, "pyrochlore", 0x2b1100,
    // METALLIC));
    public static Material FerriteMixture = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ferrite_mixture", 0xb4b4b4, METALLIC));
    public static Material Massicot = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "massicot", 0xffdd55, DULL));
    public static Material ArsenicTrioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "arsenic_trioxide", 0xffffff, SHINY));
    public static Material CobaltOxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cobalt_oxide", 0x668000, DULL));
    public static Material Magnesia = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnesia", 0xffffff, DULL));
    public static Material Quicklime = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "quicklime", 0xf0f0f0, DULL));
    public static Material Potash = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "potash", 0x784237, DULL));
    public static Material SodaAsh = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "soda_ash", 0xdcdcff, DULL));
    public static Material Brick = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "brick", 0x9b5643, ROUGH));
    public static Material Fireclay = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "fireclay", 0xada09b, ROUGH));
    public static Material SodiumBisulfate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium_bisulfate", 0x004455, NONE));
    public static Material SodiumSulfate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium_sulfate", 0x004455, NONE));
    public static Material RawStyreneButadieneRubber = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "raw_styrene_butadiene_rubber", 0x54403d, SHINY));
    public static Material PhosphorousPentoxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phosphorous_pentoxide", 0xdcdc00, NONE));
    public static Material SodiumHydroxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodium_hydroxide", 0x003380, DULL));
    public static Material Spessartine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "spessartine", 0xff6464, DULL));
    public static Material Sphalerite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sphalerite", 0xffffff, DULL));
    public static Material Stibnite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "stibnite", 0x464646, METALLIC));
    public static Material Tetrahedrite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tetrahedrite", 0xc82000, DULL));
    public static Material Tungstate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tungstate", 0x373223, DULL));
    public static Material Uraninite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uraninite", 0x232323, METALLIC));
    public static Material Uvarovite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "uvarovite", 0xb4ffb4, DIAMOND));
    public static Material Wulfenite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "wulfenite", 0xff8000, DULL));
    public static Material YellowLimonite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "yellow_limonite", 0xc8c800, METALLIC));
    // public static Material SealedWood = AntimatterAPI.register(Material.class,
    // new Material(Ref.ID, "sealed_wood", 0x502800, NONE)).addTools(3.0F,
    // 24, 0).addComposition(of(Wood, 1; TODO: Perhaps with IE integration or when
    // we have some utility stuf;
    public static Material PotassiumFeldspar = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "potassium_feldspar", 0x782828, FINE));
    public static Material Biotite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "biotite", 0x141e14, METALLIC));
    public static Material VanadiumMagnetite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vanadium_magnetite", 0x23233c, METALLIC));
    public static Material Bastnasite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bastnasite", 0xc86e2d, FINE));
    public static Material Pentlandite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "pentlandite", 0xa59605, DULL));
    public static Material Spodumene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "spodumene", 0xbeaaaa, DULL));
    public static Material Tantalite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tantalite", 0x915028, METALLIC));
    public static Material Lepidolite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lepidolite", 0xf0328c, FINE))
            ; // TODO: Ore Gen;
    public static Material Glauconite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "glauconite", 0x82b43c, DULL)); // TODO: Ore Gen;
    public static Material Bentonite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bentonite", 0xf5d7d2, ROUGH)); // TODO:
    // Ore
    // Gen;
    public static Material Pitchblende = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "pitchblende", 0xc8d200, DULL));
    public static Material Malachite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "malachite", 0x055f05, DULL));
    public static Material Barite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "barite", 0xe6ebff, DULL));
    public static Material Talc = AntimatterAPI.register(Material.class, new Material(Ref.ID, "talc", 0x5ab45a, DULL));
    public static Material Soapstone = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "soapstone", 0x5f915f, DULL)); // TODO: Ore Gen;
    public static Material Concrete = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "concrete", 0x646464, ROUGH));
    public static Material AntimonyTrioxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "antimony_trioxide", 0xe6e6f0, DULL));
    public static Material CupricOxide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cupric_oxide", 0x0f0f0f, DULL));
    public static Material Ferrosilite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ferrosilite", 0x97632a, DULL));

    /**
     * Gems
     **/
    // public static Material CertusQuartz = AntimatterAPI.register(Material.class,
    // new Material(Ref.ID, "certus_quartz", 0xd2d2e6, QUARTZ).asGemBasic(false,
    // PLATE, ORE).addTools(5.0F, 32, 1; TODO: Only when AE2 is loade;
    public static Material Dilithium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "dilithium", 0xfffafa, DIAMOND));
    public static Material NetherStar = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nether_star", 0xffffff, NONE)); // Made Nether Stars usabl;

    // Brittle Gems
    public static Material BlueTopaz = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "blue_topaz", 0x0000ff, GEM_H));
    public static Material Charcoal = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "charcoal", 0x644646, LIGNITE));
    public static Material CoalCoke = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "coal_coke", 0x8c8caa, LIGNITE));
    public static Material LigniteCoke = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lignite_coke", 0x8c6464, LIGNITE));

    public static Material GreenSapphire = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "green_sapphire", 0x64c882, GEM_H));
    public static Material Lazurite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lazurite", 0x6478ff, LAPIS)); // TODO I think this is
                                                                                          // needed;
    public static Material Ruby = AntimatterAPI.register(Material.class, new Material(Ref.ID, "ruby", 0xff6464, RUBY));
    public static Material BlueSapphire = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "blue_sapphire", 0x6464c8, GEM_V));
    public static Material Sodalite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sodalite", 0x1414ff, LAPIS)); // TODO I think this is
                                                                                           // needed;
    public static Material Tanzanite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tanzanite", 0x4000c8, GEM_V));
    public static Material Topaz = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "topaz", 0xff8000, GEM_H));
    public static Material Glass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "glass", 0xfafafa, SHINY));
    public static Material Olivine = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "olivine", 0x96ff96, RUBY));
    public static Material Opal = AntimatterAPI.register(Material.class, new Material(Ref.ID, "opal", 0x0000ff, RUBY));
    public static Material Amethyst = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "amethyst", 0xd232d2, RUBY));
    public static Material Phosphorus = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "phosphorus", 0xffff00, TextureSet.FLINT));
    public static Material RedGarnet = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "red_garnet", 0xc85050, GARNET));
    public static Material YellowGarnet = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "yellow_garnet", 0xc8c850, GARNET));
    // public static Material Monazite = AntimatterAPI.register(Material.class, new
    // Material(Ref.ID, "monazite", 0x324632, DIAMOND).asGemBasic(false,
    // ORE).addComposition(of(RareEarth, 1, Phosphate, 1));

    /**
     *
     **/
    public static Material Cinnabar = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cinnabar", 0x960000, ROUGH));

    /**
     * Metals
     **/
    public static Material AnnealedCopper = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "annealed_copper", 0xff7814, SHINY));
    public static Material BatteryAlloy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "battery_alloy", 0x9c7ca0, DULL));
    public static Material Brass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "brass", 0xffb400, METALLIC));
    public static Material Bronze = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bronze", 0xff8000, METALLIC));
    public static Material Cupronickel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cupronickel", 0xe39680, METALLIC));
    public static Material Electrum = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "electrum", 0xffff64, SHINY));
    public static Material Invar = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "invar", 0xb4b478, METALLIC));
    public static Material Kanthal = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "kanthal", 0xc2d2df, METALLIC));
    public static Material Magnalium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnalium", 0xc8beff, DULL));
    public static Material Nichrome = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nichrome", 0xcdcef6, METALLIC));
    public static Material NiobiumTitanium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "niobium_titanium", 0x1d1d29, DULL));
    public static Material SolderingAlloy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "soldering_alloy", 0xdcdce6, DULL));
    public static Material Steel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steel", 0x808080, METALLIC));
    public static Material StainlessSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "stainless_steel", 0xc8c8dc, SHINY));
    public static Material Ultimet = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "ultimet", 0xb4b4e6, SHINY));
    public static Material VanadiumGallium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vanadium_gallium", 0x80808c, SHINY));
    public static Material WroughtIron = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "wrought_iron", 0xc8b4b4, METALLIC));
    public static Material YttriumBariumCuprate = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "yttrium_barium_cuprate", 0x504046, METALLIC));
    public static Material SterlingSilver = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "sterling_silver", 0xfadce1, SHINY));
    public static Material RoseGold = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rose_gold", 0xffe61e, SHINY));
    public static Material BlackBronze = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "black_bronze", 0x64327d, DULL));
    public static Material BismuthBronze = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bismuth_bronze", 0x647d7d, DULL));
    public static Material BlackSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "black_steel", 0x646464, METALLIC));
    public static Material RedSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "red_steel", 0x8c6464, METALLIC));
    public static Material BlueSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "blue_steel", 0x64648c, METALLIC));
    // public static Material DamascusSteel = AntimatterAPI.register(Material.class,
    // new Material(Ref.ID, "damascus_steel", 0x6e6e6e, METALLIC)).asMetal(2500,
    // 1500); //TODO: Sorta a
    // fantasy meta;
    public static Material TungstenSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tungstensteel", 0x6464a0, METALLIC));
    public static Material RedAlloy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "red_alloy", 0xc80000, DULL));
    public static Material CobaltBrass = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "cobalt_brass", 0xb4b4a0, METALLIC));
    public static Material IronMagnetic = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnetic_iron", 0xc8c8c8, MAGNETIC));
    public static Material SteelMagnetic = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnetic_steel", 0x808080, MAGNETIC));
    public static Material NeodymiumMagnetic = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "magnetic_neodymium", 0x646464, MAGNETIC));
    public static Material NickelZincFerrite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "nickel_zinc_ferrite", 0x3c3c3c, ROUGH));
    public static Material TungstenCarbide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tungsten_carbide", 0x330066, METALLIC));
    public static Material VanadiumSteel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vanadium_steel", 0xc0c0c0, METALLIC));
    public static Material HSSG = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hssg", 0x999900, METALLIC));
    public static Material HSSE = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hsse", 0x336600, METALLIC));
    public static Material HSSS = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hsss", 0x660033, METALLIC));
    public static Material Osmiridium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "osmiridium", 0x6464ff, METALLIC));
    public static Material Duranium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "duranium", 0xffffff, METALLIC));
    public static Material Naquadah = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "naquadah", 0x323232, METALLIC));
    public static Material NaquadahAlloy = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "naquadah_alloy", 0x282828, METALLIC));
    public static Material EnrichedNaquadah = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "enriched_naquadah", 0x323232, SHINY));
    public static Material Naquadria = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "naquadria", 0x1e1e1e, SHINY));
    public static Material Tritanium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "tritanium", 0xffffff, SHINY));
    public static Material Vibranium = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "vibranium", 0x00ffff, SHINY));

    /**
     * Solids (Plastic Related Stuff)
     **/
    public static Material Polyethylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polyethylene", 0xc8c8c8, DULL));
    public static Material SiliconRubber = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "siliconrubber", 0x9fadbb, NONE));
    public static Material Epoxid = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "epoxid", 0xc88c14, DULL));
    public static Material Silicone = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "silicone", 0xdcdcdc, DULL));
    public static Material Polycaprolactam = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polycaprolactam", 0x323232, DULL));
    public static Material Polytetrafluoroethylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polytetrafluoroethylene", 0x646464, DULL));
    public static Material Rubber = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rubber", 0x000000, SHINY));
    public static Material PolyphenyleneSulfide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polyphenylene_sulfide", 0xaa8800, DULL));
    public static Material Polystyrene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polystyrene", 0xbeb4aa, DULL));
    public static Material StyreneButadieneRubber = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "styrene_butadiene_rubber", 0x211a18, SHINY));
    public static Material PolyvinylChloride = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "polyvinyl_chloride", 0xd7e6e6, NONE));
    public static Material GalliumArsenide = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "gallium_arsenide", 0xa0a0a0, DULL));
    public static Material EpoxidFiberReinforced = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "fiber_reinforced_epoxy_resin", 0xa07010, DULL));

    public static Material RedGranite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "red_granite", 0xff0080, ROUGH));
    public static Material BlackGranite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "black_granite", 0x0a0a0a, ROUGH));
    public static Material Marble = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "marble", 0xc8c8c8, NONE));
    public static Material Komatiite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "komatiite", 0xbebe69, NONE));
    public static Material Limestone = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "limestone", 0xe6c882, NONE));
    public static Material GreenSchist = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "green_schist", 0x69be69, NONE));
    public static Material BlueSchist = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "blue_schist", 0x0569be, NONE));
    public static Material Kimberlite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "kimberlite", 0x64460a, NONE));
    public static Material Quartzite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "quartzite", 0xe6cdcd, QUARTZ));

    /**
     * Ore Stones
     **/
    public static Material Lignite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "lignite_coal", 0x644646, LIGNITE));
    public static Material Salt = AntimatterAPI.register(Material.class, new Material(Ref.ID, "salt", 0xfafafa, FINE));
    public static Material RockSalt = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "rock_salt", 0xf0c8c8, FINE));
    public static Material Bauxite = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "bauxite", 0xc86400, DULL));
    public static Material OilShale = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "oil_shale", 0x32323c, NONE));

    /**
     * Reference Materials
     **/
    public static Material Superconductor = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "superconductor", 0xffffff, NONE));
    public static Material HighPressure = AntimatterAPI.register(Material.class,
            new Material(Ref.ID, "high_pressure", 0xc80000, NONE));
    public static Material HighCapacity = AntimatterAPI.register(Material.class,
            new Material(Ref.ID, "high_capacity", 0xb00b69, NONE));
    public static Material PlasmaContainment = AntimatterAPI.register(Material.class,
            new Material(Ref.ID, "plasma_containment", 0xffff00, NONE));

    //Cracked Stuff

    public static Material SteamCrackedEthane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_ethane", 0xc8c8ff, NONE));
    public static Material SteamCrackedEthylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_ethylene", 0xe1e1e1, NONE));
    public static Material SteamCrackedPropane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_propane", 0xfae250, NONE));
    public static Material SteamCrackedPropene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_propene", 0xffdd55, NONE));
    public static Material SteamCrackedButane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_butane", 0xb6371e, NONE));
    public static Material SteamCrackedButene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_butene", 0xcf5005, NONE));
    public static Material SteamCrackedButadiene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_butadiene", 0xe86900, NONE));
    public static Material SteamCrackedLightFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_light_fuel", 0xffff00, NONE));
    public static Material SteamCrackedHeavyFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_heavy_fuel", 0xffff00, NONE));
    public static Material SteamCrackedNaphtha = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_naphtha", 0xffff00, NONE));
    public static Material SteamCrackedRefineryGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "steam_cracked_refinery_gas", 0xffffff, NONE));
    public static Material HydroCrackedEthane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_ethane", 0xc8c8ff, NONE));
    public static Material HydroCrackedEthylene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_ethylene", 0xe1e1e1, NONE));
    public static Material HydroCrackedPropane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_propane", 0xfae250, NONE));
    public static Material HydroCrackedPropene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_propene", 0xffdd55, NONE));
    public static Material HydroCrackedButane = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_butane", 0xb6371e, NONE));
    public static Material HydroCrackedButene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_butene", 0xcf5005, NONE));
    public static Material HydroCrackedButadiene = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_butadiene", 0xe86900, NONE));
    public static Material HydroCrackedLightFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_light_fuel", 0xffff00, NONE));
    public static Material HydroCrackedHeavyFuel = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_heavy_fuel", 0xffff00, NONE));
    public static Material HydroCrackedNaphtha = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_naphtha", 0xffff00, NONE));
    public static Material HydroCrackedRefineryGas = AntimatterAPI
            .register(Material.class, new Material(Ref.ID, "hydro_cracked_refinery_gas", 0xffffff, NONE));

    static {

    }

    // TODO go through the GT_Loader_Item_Block_And_Fluid and make sure all
    // explicitly added fluids have the LIQUID tag
    public static void init() {
        // TODO assign correct handle materials
        // for (Material material : generated) {
        // if (material == Blaze) {
        // material.handleMaterial = "blaze";
        // } /*else if (aMaterial.contains(SubTag.MAGICAL) &&
        // aMaterial.contains(SubTag.CRYSTAL) && Utils.isModLoaded(MOD_ID_TC)) {
        // aMaterial.mHandleMaterial = Thaumium;
        // }*/ else if (material.getMass() > Element.Tc.getMass() * 2) {
        // material.handleMaterial = Tungstensteel.;
        // } else if (material.getMass() > Element.Tc.getMass()) {
        // material.handleMaterial = Steel;
        // } else {
        // material.handleMaterial = Wood;
        // }
        // }
        // If using small ore markers, every normal ore needs a small version. This
        // greatly increases block usage
    }
}
