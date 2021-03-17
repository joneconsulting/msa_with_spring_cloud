package com.example.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.Enumeration;
import java.util.Properties;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);

        Properties props = System.getProperties();
        for(Enumeration en = props.propertyNames(); en.hasMoreElements();) {
            String key = (String)en.nextElement();
            String value = props.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

}
