package com.siroofington.createopplus;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import com.siroofington.createopplus.AllItems;

public class AllCreativeModeTabs {

    public static final RegistryEntry<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            CreateOreProcessingPlus.REGISTRATE.defaultCreativeTab("main_tab", builder ->
                    builder
                            .title(Component.translatable(Lang.CREATIVE_TAB))
                            .icon(() -> new ItemStack(AllItems.IRON_CRYSTAL.get()))  // Replace with your own icon
                            .build()
            ).register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
