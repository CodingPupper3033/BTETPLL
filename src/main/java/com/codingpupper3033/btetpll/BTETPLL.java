package com.codingpupper3033.btetpll;

import com.codingpupper3033.btetpll.events.KeyPressed;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BTETPLL.MODID, name = BTETPLL.NAME, version = BTETPLL.VERSION)
public class BTETPLL
{
    public static final String MODID = "btetpll";
    public static final String NAME = "BTE TPLL";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        KeyInit.init();
        MinecraftForge.EVENT_BUS.register(new KeyPressed());
    }
}
