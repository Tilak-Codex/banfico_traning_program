package com.banfico.week1.week1demo.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class InfoController {
    @GetMapping("/api/info")
    public Map<String, String> getInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("appName", "Week1Demo");
        map.put("version", "1.0.0");
        map.put("javaVersion", System.getProperty("java.version"));
        map.put("springBootVersion", org.springframework.boot.SpringBootVersion.getVersion());
        return map;
    }
    
}
