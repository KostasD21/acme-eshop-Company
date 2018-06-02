package com.codehub.acme.eshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcmeEshopApplication {

//    private static final Logger logger = LogManager.getLogger(AcmeEshopApplication.class);
    public static void main(String[] args) {
		SpringApplication.run(AcmeEshopApplication.class, args);

//	    logger.debug("Debugging log");
//        logger.info("Info log");
//        logger.warn("Hey, This is a warning!");
//        logger.error("Oops! We have an Error. OK");
//        logger.fatal("Damn! Fatal error. Please fix me.");
}



}