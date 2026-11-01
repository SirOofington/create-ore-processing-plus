package com.siroofington.createopplus;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

/**
 * Item registration. Each item overrides its model to borrow a vanilla texture, so the
 * template builds with no texture files of its own. Point the model at your own texture,
 * or remove the override and add assets/createopplus/textures/item/name.png.
 */
public class AllItems {

    public static final ItemEntry<Item> COPPER_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("copper_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> IRON_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("iron_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> GOLD_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("gold_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> ZINC_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("zinc_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> REDSTONE_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("redstone_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> EMERALD_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("emerald_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> LAPIS_LAZULI_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("lapis_lazuli_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.CRYSTAL)
            .register();

    public static final ItemEntry<Item> CUT_COPPER_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("cut_copper_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CUT_IRON_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("cut_iron_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CUT_GOLD_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("cut_gold_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CUT_ZINC_CRYSTAL = CreateOreProcessingPlus.REGISTRATE
            .item("cut_zinc_crystal", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> COPPER_FRAGMENT = CreateOreProcessingPlus.REGISTRATE
            .item("copper_fragment", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FRAGMENT)
            .register();

    public static final ItemEntry<Item> IRON_FRAGMENT = CreateOreProcessingPlus.REGISTRATE
            .item("iron_fragment", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FRAGMENT)
            .register();

    public static final ItemEntry<Item> GOLD_FRAGMENT = CreateOreProcessingPlus.REGISTRATE
            .item("gold_fragment", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FRAGMENT)
            .register();

    public static final ItemEntry<Item> ZINC_FRAGMENT = CreateOreProcessingPlus.REGISTRATE
            .item("zinc_fragment", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FRAGMENT)
            .register();

    public static final ItemEntry<Item> COPPER_SHARD = CreateOreProcessingPlus.REGISTRATE
            .item("copper_shard", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.SHARD)
            .register();

    public static final ItemEntry<Item> IRON_SHARD = CreateOreProcessingPlus.REGISTRATE
            .item("iron_shard", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.SHARD)
            .register();

    public static final ItemEntry<Item> GOLD_SHARD = CreateOreProcessingPlus.REGISTRATE
            .item("gold_shard", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.SHARD)
            .register();

    public static final ItemEntry<Item> ZINC_SHARD = CreateOreProcessingPlus.REGISTRATE
            .item("zinc_shard", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.SHARD)
            .register();

    public static final ItemEntry<Item> CRUDE_RAW_COPPER = CreateOreProcessingPlus.REGISTRATE
            .item("crude_raw_copper", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CRUDE_RAW_IRON = CreateOreProcessingPlus.REGISTRATE
            .item("crude_raw_iron", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CRUDE_RAW_GOLD = CreateOreProcessingPlus.REGISTRATE
            .item("crude_raw_gold", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> CRUDE_RAW_ZINC = CreateOreProcessingPlus.REGISTRATE
            .item("crude_raw_zinc", Item::new)
            .initialProperties(Item.Properties::new)
            .removeTab(AllCreativeModeTabs.MAIN_TAB.getKey())
            .register();

    public static final ItemEntry<Item> POWDERED_COPPER = CreateOreProcessingPlus.REGISTRATE
            .item("powdered_copper", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.POWDER)
            .register();

    public static final ItemEntry<Item> POWDERED_IRON = CreateOreProcessingPlus.REGISTRATE
            .item("powdered_iron", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.POWDER)
            .register();

    public static final ItemEntry<Item> POWDERED_GOLD = CreateOreProcessingPlus.REGISTRATE
            .item("powdered_gold", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.POWDER)
            .register();

    public static final ItemEntry<Item> POWDERED_ZINC = CreateOreProcessingPlus.REGISTRATE
            .item("powdered_zinc", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.POWDER)
            .register();

    public static final ItemEntry<Item> COPPER_FLAKE = CreateOreProcessingPlus.REGISTRATE
            .item("copper_flake", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FLAKE)
            .register();

    public static final ItemEntry<Item> IRON_FLAKE = CreateOreProcessingPlus.REGISTRATE
            .item("iron_flake", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FLAKE)
            .register();

    public static final ItemEntry<Item> GOLD_FLAKE = CreateOreProcessingPlus.REGISTRATE
            .item("gold_flake", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FLAKE)
            .register();

    public static final ItemEntry<Item> ZINC_FLAKE = CreateOreProcessingPlus.REGISTRATE
            .item("zinc_flake", Item::new)
            .initialProperties(Item.Properties::new)
            .tag(AllTags.FLAKE)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
