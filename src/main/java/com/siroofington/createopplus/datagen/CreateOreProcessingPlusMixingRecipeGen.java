package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.siroofington.createopplus.AllFluids;
import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidStack;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

/**
 * Mixing recipe generator. This one requires heat; drop the requiresHeat call for a
 * recipe with no heat requirement.
 */
public class CreateOreProcessingPlusMixingRecipeGen extends MixingRecipeGen {

    public GeneratedRecipe slurryWash(String id, FluidEntry<BaseFlowingFluid.Flowing> dirtySlurry, FluidEntry<BaseFlowingFluid.Flowing> outputSlurry) {
        return create(id, b -> b
                .require(dirtySlurry.get(), 125)
                .require(Tags.Fluids.WATER, 500)
                .output(outputSlurry.get(), 125));
    }

    public GeneratedRecipe crystalMix(String id, FluidEntry<BaseFlowingFluid.Flowing> cleanSlurry, ItemEntry<Item> outputCrystal) {
        return create(id, b -> b
                .require(Items.SAND)
                .require(cleanSlurry.get(), 250)
                .output(outputCrystal.get())
                .requiresHeat(HeatCondition.HEATED));
    }

    public GeneratedRecipe moltenCrystalMix(String id, FluidEntry<BaseFlowingFluid.Flowing> cleanSlurry, ItemEntry<Item> outputCrystal) {
        return create(id, b -> b
                .require(Items.SAND)
                .require(cleanSlurry.get(), 500)
                .output(outputCrystal.get())
                .requiresHeat(HeatCondition.HEATED));
    }

    public GeneratedRecipe flakeMix(String id, ItemEntry<Item> powder, ItemEntry<Item> flake) {
        return create(id, b -> b
                .require(powder.get())
                .require(Fluids.LAVA, 250)
                .output(flake.get(), 9)
                .requiresHeat(HeatCondition.HEATED));
    }

    public GeneratedRecipe flakeMixBonus(String id, ItemEntry<Item> powder, ItemEntry<Item> flake) {
        return create(id, b -> b
                .require(powder.get())
                .require(Fluids.LAVA, 500)
                .output(flake.get(), 12)
                .requiresHeat(HeatCondition.SUPERHEATED));
    }

    GeneratedRecipe SUPERHEATED_LAVA = create("createopplus_superheated_lava_mixing", b -> b
            .require(com.simibubi.create.AllItems.POWDERED_OBSIDIAN.get())
            .require(com.simibubi.create.AllItems.POWDERED_OBSIDIAN.get())
            .require(com.simibubi.create.AllItems.POWDERED_OBSIDIAN.get())
            .require(com.simibubi.create.AllItems.POWDERED_OBSIDIAN.get())
            .require(Tags.Fluids.LAVA, 1000)
            .output(AllFluids.SUPERHEATED_LAVA.get(), 250)
            .requiresHeat(HeatCondition.SUPERHEATED));

    GeneratedRecipe COPPER_SLURRY_WASH = slurryWash("createopplus_copper_slurry_wash", AllFluids.DIRTY_COPPER_SLURRY, AllFluids.COPPER_SLURRY);
    GeneratedRecipe IRON_SLURRY_WASH = slurryWash("createopplus_iron_slurry_wash", AllFluids.DIRTY_IRON_SLURRY, AllFluids.IRON_SLURRY);
    GeneratedRecipe GOLD_SLURRY_WASH = slurryWash("createopplus_gold_slurry_wash", AllFluids.DIRTY_GOLD_SLURRY, AllFluids.GOLD_SLURRY);
    GeneratedRecipe ZINC_SLURRY_WASH = slurryWash("createopplus_zinc_slurry_wash", AllFluids.DIRTY_ZINC_SLURRY, AllFluids.ZINC_SLURRY);

    GeneratedRecipe COPPER_CRYSTAL_MIX = crystalMix("createopplus_copper_crystal_mix", AllFluids.COPPER_SLURRY, AllItems.COPPER_CRYSTAL);
    GeneratedRecipe IRON_CRYSTAL_MIX = crystalMix("createopplus_iron_crystal_mix", AllFluids.IRON_SLURRY, AllItems.IRON_CRYSTAL);
    GeneratedRecipe GOLD_CRYSTAL_MIX = crystalMix("createopplus_gold_crystal_mix", AllFluids.GOLD_SLURRY, AllItems.GOLD_CRYSTAL);
    GeneratedRecipe ZINC_CRYSTAL_MIX = crystalMix("createopplus_zinc_crystal_mix", AllFluids.ZINC_SLURRY, AllItems.ZINC_CRYSTAL);

    GeneratedRecipe REDSTONE_CRYSTAL_MIX = moltenCrystalMix("createopplus_redstone_crystal_mix", AllFluids.MOLTEN_REDSTONE, AllItems.REDSTONE_CRYSTAL);
    GeneratedRecipe EMERALD_CRYSTAL_MIX = moltenCrystalMix("createopplus_emerald_crystal_mix", AllFluids.MOLTEN_EMERALD, AllItems.EMERALD_CRYSTAL);
    GeneratedRecipe LAPIS_LAZULI_CRYSTAL_MIX = moltenCrystalMix("createopplus_lapis_lazuli_crystal_mix", AllFluids.MOLTEN_LAPIS_LAZULI, AllItems.LAPIS_LAZULI_CRYSTAL);

    GeneratedRecipe COPPER_FLAKE_MIX = flakeMix("createopplus_copper_flake_mix", AllItems.POWDERED_COPPER, AllItems.COPPER_FLAKE);
    GeneratedRecipe IRON_FLAKE_MIX = flakeMix("createopplus_iron_flake_mix", AllItems.POWDERED_IRON, AllItems.IRON_FLAKE);
    GeneratedRecipe GOLD_FLAKE_MIX = flakeMix("createopplus_gold_flake_mix", AllItems.POWDERED_GOLD, AllItems.GOLD_FLAKE);
    GeneratedRecipe ZINC_FLAKE_MIX = flakeMix("createopplus_zinc_flake_mix", AllItems.POWDERED_ZINC, AllItems.ZINC_FLAKE);

    GeneratedRecipe COPPER_FLAKE_MIX_BONUS = flakeMixBonus("createopplus_copper_flake_mix_bonus", AllItems.POWDERED_COPPER, AllItems.COPPER_FLAKE);
    GeneratedRecipe IRON_CRYSTAL_MIX_BONUS = flakeMixBonus("createopplus_iron_flake_mix_bonus", AllItems.POWDERED_IRON, AllItems.IRON_FLAKE);
    GeneratedRecipe GOLD_CRYSTAL_MIX_BONUS = flakeMixBonus("createopplus_gold_flake_mix_bonus", AllItems.POWDERED_GOLD, AllItems.GOLD_FLAKE);
    GeneratedRecipe ZINC_CRYSTAL_MIX_BONUS = flakeMixBonus("createopplus_zinc_flake_mix_bonus", AllItems.POWDERED_ZINC, AllItems.ZINC_FLAKE);

    public CreateOreProcessingPlusMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
