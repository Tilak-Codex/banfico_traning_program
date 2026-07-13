package com.banfico.week1.week1demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // To indicate that this class is a controller and will handle HTTP requests.
public class GetHealthController {
    @GetMapping("/health") // To map the HTTP GET requests to the /health endpoint to this method.
    public String getHealth(@RequestParam(required=false) String param) {
        if("Tilak".equalsIgnoreCase(param)){
            return "Appication Running \n WelcomeTilak";
        } else {
            return "\"Appication Running \n Hello Guest";
        }
    }
    
}
