package com.codexmo.codexauto;

import com.codexmo.codexauto.config.EnvironmentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodexautoApplication implements CommandLineRunner {

    @Autowired
    private EnvironmentConfig envConf;

    public static void main(String[] args) {
        SpringApplication.run(CodexautoApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(envConf.getBaseFilePath());
    }
}
