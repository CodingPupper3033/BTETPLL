package com.codingpupper3033.btetpll;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

/**
 * Binds the key binds of the mod
 */
public final class KeyInit {
    public static KeyBinding sendTpllKeybind;

    public static void init() {
        sendTpllKeybind = registerKey("Tpll to clipboard", "BTE TPLL", Keyboard.KEY_0);
    }

    public static KeyBinding registerKey(String name, String category, int keycode) {
        KeyBinding key = new KeyBinding(name, keycode, category);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
