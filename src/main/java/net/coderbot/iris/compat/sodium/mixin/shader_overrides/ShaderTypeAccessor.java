package net.coderbot.iris.compat.sodium.mixin.shader_overrides;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import me.jellysquid.mods.sodium.client.gl.shader.ShaderType;

@Mixin(ShaderType.class)
public interface ShaderTypeAccessor {
	@Invoker(value = "<init>")
	static ShaderType createShaderType(String name, int ordinal, int glId) {
		throw new AssertionError();
	}
}
