package com.lucab.tool_swapper.fabric;

import net.fabricmc.api.ModInitializer;

import com.lucab.tool_swapper.ToolSwapper;

public final class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ToolSwapper.init();
    }
}
