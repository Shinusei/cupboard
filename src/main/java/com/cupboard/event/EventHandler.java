package com.cupboard.event;

import com.cupboard.config.CupboardConfig;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

/**
 * Forge event bus handler, ingame events are fired here
 */
public class EventHandler
{
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event)
    {
        CupboardConfig.pollConfigs();
    }

    @SubscribeEvent
    public static void serverstart(ServerStartedEvent event)
    {
        CupboardConfig.initloadAll();
    }
}
