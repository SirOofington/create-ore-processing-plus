package com.siroofington.createopplus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class AllTags {
    public static TagKey<Item> newItemTag(String id) {
        return ItemTags.create(
                ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, id)
        );
    }

    public static TagKey<Fluid> newFluidTag(String id) {
        return FluidTags.create(
                ResourceLocation.fromNamespaceAndPath(CreateOreProcessingPlus.ID, id)
        );
    }

    public static final TagKey<Fluid> DIRTY_SLURRY = newFluidTag("dirty_slurry");
    public static final TagKey<Fluid> SLURRY = newFluidTag("slurry");
    public static final TagKey<Item> DIRTY_SLURRY_BUCKET = newItemTag("dirty_slurry_bucket");
    public static final TagKey<Item> SLURRY_BUCKET = newItemTag("slurry_bucket");
    public static final TagKey<Item> CRYSTAL = newItemTag("crystal");
    public static final TagKey<Item> FRAGMENT = newItemTag("fragment");
    public static final TagKey<Item> SHARD = newItemTag("shard");
    public static final TagKey<Item> POWDER = newItemTag("powder");
    public static final TagKey<Item> FLAKE = newItemTag("flake");

}
