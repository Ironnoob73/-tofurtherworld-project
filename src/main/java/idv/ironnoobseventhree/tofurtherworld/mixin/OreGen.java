package idv.ironnoobseventhree.tofurtherworld.mixin;

import idv.ironnoobseventhree.tofurtherworld.Core;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class OreGen {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addOres(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.CopperGen);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.AluminumGen);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.TinGen);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.LeadGen);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.SilverGen);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Core.ForgottenIronGen);
    }
}
