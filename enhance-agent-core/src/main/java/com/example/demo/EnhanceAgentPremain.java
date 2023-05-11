package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.Instrumentation;

public class EnhanceAgentPremain {

    private final static Logger log = LoggerFactory.getLogger(EnhanceAgentPremain.class);

    public static void premain(String agentArgs, Instrumentation instrumentation) throws Throwable {
        log.info("Enhance agent premain start...");
        log.info("agentArgs={}, instrumentation={}", agentArgs, instrumentation);
        log.info("Enhance agent premain end...");
    }

}
