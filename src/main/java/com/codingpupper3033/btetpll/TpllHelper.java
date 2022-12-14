package com.codingpupper3033.btetpll;

import net.minecraft.client.Minecraft;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * @author Joshua Miller
 */
public class TpllHelper {
    public static final String TPLL_COMMAND_FORMAT = "/tpll %s";

    public static String getClipboardText() throws IOException, UnsupportedFlavorException {
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();

        return (String) c.getData(DataFlavor.stringFlavor);
    }

    public static boolean sendCommand(String command) {
        Minecraft.getMinecraft().player.sendChatMessage(command);
        return true;
    }

    public static boolean sendTpllLatLon(String latLon) {
        sendCommand(String.format(TPLL_COMMAND_FORMAT, latLon));
        return true;
    }

    public static boolean sendTpllClipboard() {
        try {
            sendTpllLatLon(getClipboardText());
            return true;
        } catch (IOException e) {
            return false;
        } catch (UnsupportedFlavorException e) {
            return false;
        }
    }
}
