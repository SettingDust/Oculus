package net.coderbot.iris.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.GameRenderer;

@Mixin(GameRenderer.class)
public interface GameRendererAccessor {
	@Accessor
	boolean getRenderHand();

	@Accessor
	boolean getPanoramicMode();

	@Invoker
	void invokeBobView(PoseStack poseStack, float tickDelta);

	@Invoker
	void invokeBobHurt(PoseStack poseStack, float tickDelta);
}
