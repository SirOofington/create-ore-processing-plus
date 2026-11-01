package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

/**
 * Crushing recipe generator. Shows a guaranteed output alongside a chance-based
 * secondary output.
 */

public class CreateOreProcessingPlusCrushingRecipeGen extends CrushingRecipeGen {

    public GeneratedRecipe fragmentCrush(String id, ItemEntry<Item> crystal, ItemEntry<Item> fragment) {
        return create(id, b -> b
                .require(crystal.get())
                .output(fragment.get(), 4)
                .output(0.05f, fragment.get())
                .duration(400));
    }

    public GeneratedRecipe powderCrush(String id, ItemEntry<Item> shard, ItemEntry<Item> powder) {
        return create(id, b -> b
                .require(shard.get())
                .output(powder.get())
                .duration(400));
    }

    public GeneratedRecipe gemCrush(String id, ItemEntry<Item> crystal, Item gem, int outputAmount) {
        return create(id, b -> b
                .require(crystal.get())
                .output(gem, outputAmount)
                .output(0.25f, gem, outputAmount)
                .duration(400));
    }

    GeneratedRecipe COPPER_FRAGMENT = fragmentCrush("createopplus_copper_fragment_crush", AllItems.COPPER_CRYSTAL, AllItems.COPPER_FRAGMENT);
    GeneratedRecipe IRON_FRAGMENT = fragmentCrush("createopplus_iron_fragment_crush", AllItems.IRON_CRYSTAL, AllItems.IRON_FRAGMENT);
    GeneratedRecipe GOLD_FRAGMENT = fragmentCrush("createopplus_gold_fragment_crush", AllItems.GOLD_CRYSTAL, AllItems.GOLD_FRAGMENT);
    GeneratedRecipe ZINC_FRAGMENT = fragmentCrush("createopplus_zinc_fragment_crush", AllItems.ZINC_CRYSTAL, AllItems.ZINC_FRAGMENT);

    GeneratedRecipe REDSTONE_CRUSH = gemCrush("createopplus_redstone_crush", AllItems.REDSTONE_CRYSTAL, Items.REDSTONE, 8);
    GeneratedRecipe EMERALD_CRUSH = gemCrush("createopplus_emerald_crush", AllItems.EMERALD_CRYSTAL, Items.EMERALD, 4);
    GeneratedRecipe LAPIS_LAZULI_CRUSH = gemCrush("createopplus_lapis_lazuli_crush", AllItems.LAPIS_LAZULI_CRYSTAL, Items.LAPIS_LAZULI, 36);

    GeneratedRecipe POWDERED_COPPER_CRUSH = powderCrush("createopplus_powdered_copper_crush", AllItems.COPPER_SHARD, AllItems.POWDERED_COPPER);
    GeneratedRecipe POWDERED_IRON_CRUSH = powderCrush("createopplus_powdered_iron_crush", AllItems.IRON_SHARD, AllItems.POWDERED_IRON);
    GeneratedRecipe POWDERED_GOLD_CRUSH = powderCrush("createopplus_powdered_gold_crush", AllItems.GOLD_SHARD, AllItems.POWDERED_GOLD);
    GeneratedRecipe POWDERED_ZINC_CRUSH = powderCrush("createopplus_powdered_zinc_crush", AllItems.ZINC_SHARD, AllItems.POWDERED_ZINC);

    public CreateOreProcessingPlusCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
