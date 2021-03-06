package com.codexmo.codexauto.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:environment.properties")
@ConfigurationProperties("env")
public class EnvironmentConfig {

    @Value("${env.base-file-path}")
    private String baseFilePath;

    @Value("${env.report-file-path}")
    private String reportFilePath;

    @Bean
    public String getBaseFilePath() {
        return baseFilePath;
    }

    public void setBaseFilePath(String baseFilePath) {
        this.baseFilePath = baseFilePath;
    }

    @Bean
    public String getReportFilePath() {
        return reportFilePath;
    }


    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }
}
