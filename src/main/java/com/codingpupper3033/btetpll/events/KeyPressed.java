package com.codingpupper3033.btetpll.events;

import com.codingpupper3033.btetpll.KeyInit;
import com.codingpupper3033.btetpll.TpllHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Will Respond to players pressing a key
 * @author Joshua Miller
 */
public class KeyPressed {
    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (Minecraft.getMinecraft().currentScreen == null) { // Keystrokes that only work on the default game menu
            // Open KML Menu
            if (KeyInit.sendTpllKeybind.isPressed()) {
                boolean worked = TpllHelper.sendTpllClipboard();
                System.out.println(worked);
                if (worked) Minecraft.getMinecraft().player.playSound(SoundEvents.ENTITY_ENDERMEN_TELEPORT, 100, 0);
            }
        }
    }
}
