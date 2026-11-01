package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Pressing recipe generator.
 */
public class CreateOreProcessingPlusPressingRecipeGen extends PressingRecipeGen {

    /*
    GeneratedRecipe EXAMPLE = create("createopplus_pressing", b -> b
            .require(Items.IRON_INGOT)
            .output(AllItems.EXAMPLE_ITEM.get()));
    */

    public CreateOreProcessingPlusPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
