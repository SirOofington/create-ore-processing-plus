package com.siroofington.createopplus.datagen;

import com.siroofington.createopplus.AllItems;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;

import java.util.concurrent.CompletableFuture;

public class CreateOreProcessingPlusRecipeProvider extends RecipeProvider {
    public CreateOreProcessingPlusRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public void shardRecipe(ItemEntry<Item> fragment, ItemEntry<Item> shard, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, shard.get(), 1)
                .pattern("AA")
                .pattern("AA")
                .define('A', fragment.get())
                .unlockedBy("has_item", has(fragment.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, fragment.get(), 4)
                .requires(shard.get())
                .unlockedBy("has_item", has(fragment.get()))
                .save(recipeOutput);
    }

    public void flakeRecipe(ItemEntry<Item> flake, Item ore, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ore, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', flake.get())
                .unlockedBy("has_item", has(flake.get()))
                .save(recipeOutput);
    }

    public void powderSmeltRecipe(ItemEntry<Item> powder, Item nugget, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(powder.get()),
                RecipeCategory.MISC,
                new ItemStack(nugget, 3),
                0.0f,
                200
        )
                .unlockedBy("has_item", has(powder.get()))
                .save(recipeOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        shardRecipe(AllItems.COPPER_FRAGMENT, AllItems.COPPER_SHARD, recipeOutput);
        shardRecipe(AllItems.IRON_FRAGMENT, AllItems.IRON_SHARD, recipeOutput);
        shardRecipe(AllItems.GOLD_FRAGMENT, AllItems.GOLD_SHARD, recipeOutput);
        shardRecipe(AllItems.ZINC_FRAGMENT, AllItems.ZINC_SHARD, recipeOutput);

        powderSmeltRecipe(AllItems.POWDERED_COPPER, com.simibubi.create.AllItems.COPPER_NUGGET.get(), recipeOutput);
        powderSmeltRecipe(AllItems.POWDERED_IRON, Items.IRON_NUGGET, recipeOutput);
        powderSmeltRecipe(AllItems.POWDERED_GOLD, Items.GOLD_NUGGET, recipeOutput);
        powderSmeltRecipe(AllItems.POWDERED_ZINC, com.simibubi.create.AllItems.ZINC_NUGGET.get(), recipeOutput);

        flakeRecipe(AllItems.COPPER_FLAKE, com.simibubi.create.AllItems.CRUSHED_COPPER.get(), recipeOutput);
        flakeRecipe(AllItems.IRON_FLAKE, com.simibubi.create.AllItems.CRUSHED_IRON.get(), recipeOutput);
        flakeRecipe(AllItems.GOLD_FLAKE, com.simibubi.create.AllItems.CRUSHED_GOLD.get(), recipeOutput);
        flakeRecipe(AllItems.ZINC_FLAKE, com.simibubi.create.AllItems.CRUSHED_ZINC.get(), recipeOutput);
    }
}
