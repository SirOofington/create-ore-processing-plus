package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Splashing recipe generator.
 */
public class CreateOreProcessingPlusWashingRecipeGen extends WashingRecipeGen {

    /*
    GeneratedRecipe EXAMPLE = create("createopplus_washing",
            b -> b.require(Items.DIRT).output(AllItems.EXAMPLE_ITEM.get()));
    */

    public CreateOreProcessingPlusWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
