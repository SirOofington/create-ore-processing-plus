package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.siroofington.createopplus.AllFluids;
import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;

import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

/**
 * Compacting recipe generator. Shows several inputs producing a single output.
 */
public class CreateOreProcessingPlusCompactingRecipeGen extends CompactingRecipeGen {

    public GeneratedRecipe dirtySlurryCompact(String id, Item rawOre, FluidEntry<BaseFlowingFluid.Flowing> outputSlurry) {
        return create(id, b -> b
                .require(rawOre)
                .require(AllFluids.SUPERHEATED_LAVA.get(), 1000)
                .output(outputSlurry.get(), 1000));
    }

    public GeneratedRecipe moltenCompact(String id, TagKey<Item> rawOreBlock, FluidEntry<BaseFlowingFluid.Flowing> outputMolten) {
        return create(id, b -> b
                .require(rawOreBlock)
                .require(AllFluids.SUPERHEATED_LAVA.get(), 1000)
                .output(outputMolten.get(), 1000));
    }

    public GeneratedRecipe doubleOreCompact(String id, Item rawOreBlock, Item crushedRawOre) {
        return create(id, b -> b
                .require(rawOreBlock)
                .require(Fluids.LAVA, 250)
                .output(crushedRawOre, 18));
    }

    public GeneratedRecipe crushedRawOreBonus(String id, Item crushedRawOre, Item nugget) {
        return create(id, b -> b
                .require(crushedRawOre)
                .require(crushedRawOre)
                .require(Fluids.LAVA, 250)
                .output(nugget, 27)
                .requiresHeat(HeatCondition.HEATED));
    }

    GeneratedRecipe NETHERITE_TRIPLE_COMPACT = create("createopplus_netherite_triple_compact", b -> b
            .require(Items.NETHERITE_SCRAP)
            .require(Items.NETHERITE_SCRAP)
            .require(Items.NETHERITE_SCRAP)
            .require(Items.NETHERITE_SCRAP)
            .require(AllFluids.GOLD_SLURRY.get(), 1000)
            .output(Items.NETHERITE_INGOT, 3)
            .requiresHeat(HeatCondition.SUPERHEATED)
    );

    GeneratedRecipe DIRTY_COPPER_SLURRY_COMPACT = dirtySlurryCompact("createopplus_dirty_copper_slurry_compact", Items.RAW_COPPER, AllFluids.DIRTY_COPPER_SLURRY);
    GeneratedRecipe DIRTY_IRON_SLURRY_COMPACT = dirtySlurryCompact("createopplus_dirty_iron_slurry_compact", Items.RAW_IRON, AllFluids.DIRTY_IRON_SLURRY);
    GeneratedRecipe DIRTY_GOLD_SLURRY_COMPACT = dirtySlurryCompact("createopplus_dirty_gold_slurry_compact", Items.RAW_GOLD, AllFluids.DIRTY_GOLD_SLURRY);
    GeneratedRecipe DIRTY_ZINC_SLURRY_COMPACT = dirtySlurryCompact("createopplus_dirty_zinc_slurry_compact", com.simibubi.create.AllItems.RAW_ZINC.get(), AllFluids.DIRTY_ZINC_SLURRY);

    GeneratedRecipe MOLTEN_REDSTONE_COMPACT = moltenCompact("createopplus_molten_redstone_compact", Tags.Items.ORES_REDSTONE, AllFluids.MOLTEN_REDSTONE);
    GeneratedRecipe MOLTEN_EMERALD_COMPACT = moltenCompact("createopplus_molten_emerald_compact", Tags.Items.ORES_EMERALD, AllFluids.MOLTEN_EMERALD);
    GeneratedRecipe MOLTEN_LAPIS_LAZULI_COMPACT = moltenCompact("createopplus_molten_lapis_lazuli_compact", Tags.Items.ORES_LAPIS, AllFluids.MOLTEN_LAPIS_LAZULI);

    GeneratedRecipe DOUBLE_CRUSHED_RAW_COPPER = doubleOreCompact("createopplus_double_crushed_raw_copper_compact", Items.RAW_COPPER_BLOCK, com.simibubi.create.AllItems.CRUSHED_COPPER.get());
    GeneratedRecipe DOUBLE_CRUSHED_RAW_IRON = doubleOreCompact("createopplus_double_crushed_raw_iron_compact", Items.RAW_IRON_BLOCK, com.simibubi.create.AllItems.CRUSHED_IRON.get());
    GeneratedRecipe DOUBLE_CRUSHED_RAW_GOLD = doubleOreCompact("createopplus_double_crushed_raw_gold_compact", Items.RAW_GOLD_BLOCK, com.simibubi.create.AllItems.CRUSHED_GOLD.get());
    GeneratedRecipe DOUBLE_CRUSHED_RAW_ZINC = doubleOreCompact("createopplus_double_crushed_raw_zinc_compact", com.simibubi.create.AllBlocks.RAW_ZINC_BLOCK.asItem(), com.simibubi.create.AllItems.CRUSHED_ZINC.get());

    GeneratedRecipe CRUSHED_RAW_COPPER_BONUS = crushedRawOreBonus("createopplus_crushed_raw_copper_bonus_compact", com.simibubi.create.AllItems.CRUSHED_COPPER.get(), com.simibubi.create.AllItems.COPPER_NUGGET.get());
    GeneratedRecipe CRUSHED_RAW_IRON_BONUS = crushedRawOreBonus("createopplus_crushed_raw_iron_bonus_compact", com.simibubi.create.AllItems.CRUSHED_IRON.get(), Items.IRON_NUGGET);
    GeneratedRecipe CRUSHED_RAW_GOLD_BONUS = crushedRawOreBonus("createopplus_crushed_raw_gold_bonus_compact", com.simibubi.create.AllItems.CRUSHED_GOLD.get(), Items.GOLD_NUGGET);
    GeneratedRecipe CRUSHED_RAW_ZINC_BONUS = crushedRawOreBonus("createopplus_crushed_raw_zinc_bonus_compact", com.simibubi.create.AllItems.CRUSHED_ZINC.get(), com.simibubi.create.AllItems.ZINC_NUGGET.get());
    
    public CreateOreProcessingPlusCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
