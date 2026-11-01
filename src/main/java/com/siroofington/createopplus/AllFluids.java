package com.siroofington.createopplus;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.minecraft.tags.FluidTags;

public class AllFluids {
    private static final CreateRegistrate REGISTRATE = CreateOreProcessingPlus.REGISTRATE;

    public static final TagKey<Item> BLAZE_BURNER_FUEL_SPECIAL = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath("create", "blaze_burner_fuel/special")
    );

    public static FluidEntry<BaseFlowingFluid.Flowing> newSlurry(String id, String name, TagKey<Fluid> slurryTag, TagKey<Item> bucketTag) {
        return REGISTRATE.fluid(
                    id,
                    ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, "block/" + id + "_still"),
                    ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, "block/" + id + "_flow"))
                .lang(name)
                .properties(b -> b.viscosity(6000).density(1400))
                .fluidProperties(p -> p
                        .levelDecreasePerBlock(2)
                        .tickRate(30)
                        .slopeFindDistance(3)
                        .explosionResistance(100f))
                .source(BaseFlowingFluid.Source::new)
                .tag(slurryTag)
                .bucket()
                .tag(bucketTag)
                .build()
                .register();

    }

    public static final FluidEntry<BaseFlowingFluid.Flowing> SUPERHEATED_LAVA = REGISTRATE.fluid(
            "superheated_lava",
                ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, "block/superheated_lava_still"),
                ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, "block/superheated_lava_flow"))
            .lang("Superheated Lava")
            .properties(b -> b.temperature(1300).viscosity(6000).density(1400).lightLevel(15))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(30)
                    .slopeFindDistance(3)
                    .explosionResistance(100f))
            .source(BaseFlowingFluid.Source::new)
            .bucket()
            .properties(p -> p.craftRemainder(Items.BUCKET).stacksTo(1))
            .burnTime(80000)
            .tag(BLAZE_BURNER_FUEL_SPECIAL)
            .build()
            .register();

    public static final FluidEntry<BaseFlowingFluid.Flowing> DIRTY_COPPER_SLURRY = newSlurry("dirty_copper_slurry", "Dirty Copper Slurry", AllTags.DIRTY_SLURRY, AllTags.DIRTY_SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> DIRTY_IRON_SLURRY = newSlurry("dirty_iron_slurry", "Dirty Iron Slurry", AllTags.DIRTY_SLURRY, AllTags.DIRTY_SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> DIRTY_GOLD_SLURRY = newSlurry("dirty_gold_slurry", "Dirty Gold Slurry", AllTags.DIRTY_SLURRY, AllTags.DIRTY_SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> DIRTY_ZINC_SLURRY = newSlurry("dirty_zinc_slurry", "Dirty Zinc Slurry", AllTags.DIRTY_SLURRY, AllTags.DIRTY_SLURRY_BUCKET);

    public static final FluidEntry<BaseFlowingFluid.Flowing> COPPER_SLURRY = newSlurry("copper_slurry", "Copper Slurry", AllTags.SLURRY, AllTags.SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> IRON_SLURRY = newSlurry("iron_slurry", "Iron Slurry", AllTags.SLURRY, AllTags.SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> GOLD_SLURRY = newSlurry("gold_slurry", "Gold Slurry", AllTags.SLURRY, AllTags.SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> ZINC_SLURRY = newSlurry("zinc_slurry", "Zinc Slurry", AllTags.SLURRY, AllTags.SLURRY_BUCKET);

    public static final FluidEntry<BaseFlowingFluid.Flowing> MOLTEN_REDSTONE = newSlurry("molten_redstone", "Molten Redstone", AllTags.SLURRY, AllTags.SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> MOLTEN_EMERALD = newSlurry("molten_emerald", "Molten Emerald", AllTags.SLURRY, AllTags.SLURRY_BUCKET);
    public static final FluidEntry<BaseFlowingFluid.Flowing> MOLTEN_LAPIS_LAZULI = newSlurry("molten_lapis_lazuli", "Molten Lapis Lazuli", AllTags.SLURRY, AllTags.SLURRY_BUCKET);

    public static void register() {

    }
}
