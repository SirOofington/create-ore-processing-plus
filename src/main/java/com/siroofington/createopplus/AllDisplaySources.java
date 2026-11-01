package com.siroofington.createopplus;

import com.siroofington.createopplus.content.display.CreateOreProcessingPlusDisplaySource;
import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.tterrag.registrate.util.entry.RegistryEntry;

/**
 * Display source registration. Attach an entry to a block in AllBlocks with
 * transform(DisplaySource.displaySource(entry)).
 */
public class AllDisplaySources {

    public static final RegistryEntry<DisplaySource, CreateOreProcessingPlusDisplaySource> EXAMPLE_SOURCE = CreateOreProcessingPlus.REGISTRATE
            .displaySource("createopplus_source", CreateOreProcessingPlusDisplaySource::new)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
