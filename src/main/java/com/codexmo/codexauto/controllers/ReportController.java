package com.codexmo.codexauto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ReportController {

    @Autowired
    private Environment environment;


    public ReportController() {
        System.out.println(" ===== ");
    }

    public void getConfiguration(){
        System.out.println(environment.getProperty("env.base-file-path"));
        /*String baseFilePath = envConfig.getBaseFilePath();
        System.out.println(baseFilePath);*/
    }
}
