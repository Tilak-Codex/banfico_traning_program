package com.banfico.week1.week1demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GetHealthController {
    @GetMapping("/health")
    public String getHealth(@RequestParam(required=false) String param) {
        if("Tilak".equalsIgnoreCase(param)){
            return "Appication Running \n WelcomeTilak";
        } else {
            return "\"Appication Running \n Hello Guest";
        }
    }
    
}
