package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.simibubi.create.content.fluids.transfer.FillingRecipe;
import com.simibubi.create.content.kinetics.fan.processing.SplashingRecipe;
import com.simibubi.create.content.kinetics.mixer.MixingRecipe;
import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;

/**
 * Sequenced assembly recipe generator. Shows the multi-step form: a transitional item
 * carried between steps, a loop count, and per-step sub-recipes (a deployer
 * application followed by a press).
 */
public class CreateOreProcessingPlusSequencedAssemblyGen extends SequencedAssemblyRecipeGen {

    public GeneratedRecipe cutCrystal(String id, ItemEntry<Item> crystal, ItemEntry<Item> transition,ItemEntry<Item> fragment) {
        return create(id, b -> b
                .require(crystal.get())
                .transitionTo(transition.get())
                .addOutput(new ItemStack(fragment.get(), 5), 1f)
                .loops(8)
                .addStep(CuttingRecipe::new, rb -> rb));
    }

    public GeneratedRecipe sequenceShard(String id, Item ore, ItemEntry<Item> transition,ItemEntry<Item> shard) {
        return create(id, b -> b
                .require(ore)
                .transitionTo(transition.get())
                .addOutput(new ItemStack(shard.get(), 3), 1f)
                .loops(1)
                .addStep(FillingRecipe::new, rb -> rb.require(Fluids.WATER, 250))
                .addStep(PressingRecipe::new, rb -> rb)
                .addStep(CuttingRecipe::new, rb -> rb));
    }

    GeneratedRecipe CUT_COPPER_CRYSTAL = cutCrystal("createopplus_copper_fragment_sequence", AllItems.COPPER_CRYSTAL, AllItems.CUT_COPPER_CRYSTAL, AllItems.COPPER_FRAGMENT);
    GeneratedRecipe CUT_IRON_CRYSTAL = cutCrystal("createopplus_iron_fragment_sequence", AllItems.IRON_CRYSTAL, AllItems.CUT_IRON_CRYSTAL, AllItems.IRON_FRAGMENT);
    GeneratedRecipe CUT_GOLD_CRYSTAL = cutCrystal("createopplus_gold_fragment_sequence", AllItems.GOLD_CRYSTAL, AllItems.CUT_GOLD_CRYSTAL, AllItems.GOLD_FRAGMENT);
    GeneratedRecipe CUT_ZINC_CRYSTAL = cutCrystal("createopplus_zinc_fragment_sequence", AllItems.ZINC_CRYSTAL, AllItems.CUT_ZINC_CRYSTAL, AllItems.ZINC_FRAGMENT);

    GeneratedRecipe COPPER_SHARD = sequenceShard("createopplus_copper_shard_sequence", Items.RAW_COPPER, AllItems.CRUDE_RAW_COPPER, AllItems.COPPER_SHARD);
    GeneratedRecipe IRON_SHARD = sequenceShard("createopplus_iron_shard_sequence", Items.RAW_IRON, AllItems.CRUDE_RAW_IRON, AllItems.IRON_SHARD);
    GeneratedRecipe GOLD_SHARD = sequenceShard("createopplus_gold_shard_sequence", Items.RAW_GOLD, AllItems.CRUDE_RAW_GOLD, AllItems.GOLD_SHARD);
    GeneratedRecipe ZINC_SHARD = sequenceShard("createopplus_zinc_shard_sequence", com.simibubi.create.AllItems.RAW_ZINC.get(), AllItems.CRUDE_RAW_ZINC, AllItems.ZINC_SHARD);

    public CreateOreProcessingPlusSequencedAssemblyGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
