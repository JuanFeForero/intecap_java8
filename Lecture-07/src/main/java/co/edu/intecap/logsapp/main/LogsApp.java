/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.logsapp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Cesar
 */
public class LogsApp {
    
    private static final Logger logger = LogManager.getLogger(LogsApp.class);
    
    public static void main(String[] args) {
        logger.trace("Esto es un log en nivel trace");
        logger.debug("Esto es un log en nivel debug");
        logger.info("Esto es un log en nivel info");
        logger.warn("Esto es un log en nivel warning");
        logger.error("Esto es un log en nivel error");
        logger.fatal("Esto es un log en nivel fatal");
        
    }
}
