package com.cupboard.event;

import com.cupboard.config.CupboardConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;

public class ClientEventHandler
{
    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event)
    {
        if (!Minecraft.getInstance().hasSingleplayerServer())
        {
            CupboardConfig.pollConfigs();
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onClientTick(ScreenEvent.Opening event)
    {
        if (event.getNewScreen() instanceof TitleScreen)
        {
            CupboardConfig.initloadAll();
        }
    }
}
