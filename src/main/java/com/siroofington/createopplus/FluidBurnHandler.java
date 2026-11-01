package com.siroofington.createopplus;

import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import java.util.List;
import java.util.function.Supplier;

@EventBusSubscriber(modid = CreateOreProcessingPlus.ID)
public class FluidBurnHandler {

    private static final List<FluidEntry<BaseFlowingFluid.Flowing>> LAVA_LIKE_FLUIDS = List.of(
        AllFluids.SUPERHEATED_LAVA,
        AllFluids.DIRTY_COPPER_SLURRY,
        AllFluids.DIRTY_IRON_SLURRY,
        AllFluids.DIRTY_GOLD_SLURRY,
        AllFluids.DIRTY_ZINC_SLURRY,
        AllFluids.COPPER_SLURRY,
        AllFluids.IRON_SLURRY,
        AllFluids.GOLD_SLURRY,
        AllFluids.ZINC_SLURRY
    );


    @SubscribeEvent
    public static void onEntityTick(EntityTickEvent.Post event) {
        Entity entity = event.getEntity();

        if (entity.level().isClientSide()) return;

        FluidState fluidState = entity.level().getFluidState(entity.blockPosition());

        boolean isLavaLikeFluid = LAVA_LIKE_FLUIDS.stream().anyMatch(fluid -> {
                return fluidState.is(fluid.get().getSource()) || fluidState.is(fluid.get().getFlowing());
            }
        );

        if (isLavaLikeFluid) {
            if (!entity.isOnFire() && !entity.fireImmune()) {
                entity.setRemainingFireTicks(100);
            }

            entity.hurt(entity.damageSources().lava(), 2.0F);
        }
    }
}
