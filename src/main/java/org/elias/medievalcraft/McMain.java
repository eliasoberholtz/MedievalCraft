package org.elias.medievalcraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McMain implements ModInitializer {
    // Initialising the mod loggers and whatnot
    public static String MODID = "medievalcraft";
    private static Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        // first initialisation
        LOGGER.info("Initialising the MedievalCraft mod... (" + MODID + ")");
        LOGGER.info("The Knights Templar created?");

        // Initialising
        McItemsRegistry.init();
        McBlocksRegistry.init();
        McItemGroupsRegistry.register();


        // The end
        LOGGER.info("Finished initialised the MedievalCraft mod! (" + MODID + ")");
    }

    public static Logger getLogger(){
        return LOGGER;
    }

}
