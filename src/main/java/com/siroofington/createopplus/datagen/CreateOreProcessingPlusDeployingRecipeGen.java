package com.siroofington.createopplus.datagen;

import java.util.concurrent.CompletableFuture;

import com.siroofington.createopplus.AllItems;
import com.siroofington.createopplus.CreateOreProcessingPlus;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Deploying recipe generator. A single standalone step, unlike the multi-step
 * sequenced assembly example.
 */
public class CreateOreProcessingPlusDeployingRecipeGen extends DeployingRecipeGen {

    /*
    GeneratedRecipe EXAMPLE = create("createopplus_deploying", b -> b
            .require(Items.IRON_INGOT)
            .require(Items.COPPER_INGOT)
            .output(AllItems.EXAMPLE_RESULT.get()));

     */

    public CreateOreProcessingPlusDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateOreProcessingPlus.ID);
    }
}
