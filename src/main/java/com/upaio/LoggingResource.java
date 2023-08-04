package com.upaio;

import jakarta.ws.rs.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/logging")
public class LoggingResource {

    /**
     * @param logger
     * @return
     */
    private static Level getLogLevel(Logger logger) {
        Logger current = logger;
        while (current != null) {
            Level level = current.getLevel();
            if (level != null) {
                return level;
            }
            current = current.getParent();
        }
        return Level.INFO;
    }

    /**
     * @param loggerName
     * @param level
     * @return
     */
    @GET
    @Path("/{logger}")
    @Produces("text/plain")
    public Level logger(@PathParam("logger") String loggerName, @QueryParam("level") String level) {
        // Get the logger instance
        Logger logger = Logger.getLogger(loggerName);

        // Change the log-level if requested
        if (level != null && level.length() > 0) {
            try {
                Level logLevel = Level.parse(level.toUpperCase());
                logger.setLevel(logLevel);
            } catch (IllegalArgumentException e) {
                // Manejar el caso en que se proporciona un nivel de registro no válido
                logger.warning("Nivel de log no válido proporcionado: " + level);
            }
        }

        // Return the current log-level
        return getLogLevel(logger);
    }
}
