package net.quiltmc.users.starblade.thingsnstuff;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thingsnstuff implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Things N Stuff");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}