package com.lucab.tool_swapper.neoforge;

import net.neoforged.fml.common.Mod;

import com.lucab.tool_swapper.ToolSwapper;

@Mod(ToolSwapper.MOD_ID)
public final class ModNeoForge {
    public ModNeoForge() {
        ToolSwapper.init();
    }
}
