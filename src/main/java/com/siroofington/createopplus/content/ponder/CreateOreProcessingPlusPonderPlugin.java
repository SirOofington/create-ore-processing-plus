package com.siroofington.createopplus.content.ponder;

import com.siroofington.createopplus.AllBlocks;
import com.siroofington.createopplus.CreateOreProcessingPlus;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

/**
 * Ponder plugin for the addon, registered client-side in CreateOreProcessingPlus. registerScenes
 * associates a storyboard with one or more items. Each scene has two parts: a schematic
 * saved as an nbt file under assets/createopplus/ponder, whose name matches the id passed
 * to addStoryBoard, and the storyboard code in CreateOreProcessingPlusPonderScenes.
 */
public class CreateOreProcessingPlusPonderPlugin implements PonderPlugin {

    @Override
    public String getModId() {
        return CreateOreProcessingPlus.ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        /*
        helper.forComponents(AllBlocks.EXAMPLE_KINETIC_BLOCK.getId())
                .addStoryBoard("createopplus_ponder", CreateOreProcessingPlusPonderScenes::examplePonder);

        helper.forComponents(com.simibubi.create.AllBlocks.DESK_BELL.getId())
                .addStoryBoard("desk_bell", DeskbellScenes::intro);

         */
    }
}
