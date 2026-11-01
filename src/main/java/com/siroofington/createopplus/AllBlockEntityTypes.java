package com.siroofington.createopplus;

import com.siroofington.createopplus.content.kinetics.CreateOreProcessingPlusGeneratorBlockEntity;
import com.siroofington.createopplus.content.kinetics.CreateOreProcessingPlusKineticBlockEntity;
import com.siroofington.createopplus.content.kinetics.CreateOreProcessingPlusShaftRenderer;
import com.simibubi.create.content.kinetics.base.ShaftVisual;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

/**
 * Block entity type registration.
 */
public class AllBlockEntityTypes {

    /**
     * Block entity for EXAMPLE_KINETIC_BLOCK, rendered with CreateOreProcessingPlusShaftRenderer so a
     * shaft visibly spins through the casing.
     */

    /*
    public static final BlockEntityEntry<CreateOreProcessingPlusKineticBlockEntity> EXAMPLE_KINETIC = CreateOreProcessingPlus.REGISTRATE
            .blockEntity("createopplus_kinetic", CreateOreProcessingPlusKineticBlockEntity::new)
            // visual for flywheel renderer
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_KINETIC_BLOCK)
            // fallback renderer if flywheel is not available
            .renderer(() -> CreateOreProcessingPlusShaftRenderer::new)
            .register();


     */
    /**
     * Block entity for EXAMPLE_GENERATOR_BLOCK, also rendered with CreateOreProcessingPlusShaftRenderer.
     */
    /*
    public static final BlockEntityEntry<CreateOreProcessingPlusGeneratorBlockEntity> EXAMPLE_GENERATOR = CreateOreProcessingPlus.REGISTRATE
            .blockEntity("createopplus_generator", CreateOreProcessingPlusGeneratorBlockEntity::new)
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_GENERATOR_BLOCK)
            .renderer(() -> CreateOreProcessingPlusShaftRenderer::new)
            .register();

     */

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
