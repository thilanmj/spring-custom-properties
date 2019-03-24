package com.codexmo.codexauto;

import com.codexmo.codexauto.config.EnvironmentConfig;
import com.codexmo.codexauto.controllers.ReportController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodexautoApplication {

    @Autowired
    private EnvironmentConfig envConf;

    public static void main(String[] args) {
        SpringApplication.run(CodexautoApplication.class, args);
        ReportController rpc = new ReportController();
        rpc.getConfiguration();
    }


}
