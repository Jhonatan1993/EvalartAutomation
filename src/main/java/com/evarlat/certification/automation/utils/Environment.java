package com.evarlat.certification.automation.utils;

import lombok.Getter;

@Getter
public class Environment {
    private String url;
    public Environment(String page) {
        initializeEnvironment(page);
    }
    private void initializeEnvironment(String page) {
        String env = System.getProperty("env");
        url = String.format("env.%s.%s.baseUrl", env, page);
    }
}
