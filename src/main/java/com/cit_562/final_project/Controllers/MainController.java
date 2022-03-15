package com.cit_562.final_project.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MainController {

    private static final Logger LOGGER = LogManager.getLogger("Logger Reporting...");

    @GetMapping("/")
    public String index(@RequestHeader("X-Api-Version") String apiVersion) {
        LOGGER.info("Received a request for API version " + apiVersion);
        return "Application Base Path";
    }

}