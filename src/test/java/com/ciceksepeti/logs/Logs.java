package com.ciceksepeti.logs;

import org.apache.log4j.PropertyConfigurator;

public class Logs {

    public Logs() {
        PropertyConfigurator
                .configure(Logs.class.getClassLoader().getResource("log4j.properties"));
    }
}
