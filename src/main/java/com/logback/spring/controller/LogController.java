package com.logback.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {
    @GetMapping
    public void getLogger() {
        log.error("error!!");
        log.warn("warn!!");
        log.info("info!!");
        log.debug("debug!!");
        log.trace("trace!!");
    }
}
