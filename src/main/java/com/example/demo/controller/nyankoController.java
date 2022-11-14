package com.example.demo.controller;

import org.apache.catalina.connector.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nyankoController {
    @PostMapping("/nyankoController")
    public String nyankoCheck(){
        System.out.println("Nyanko Controller is work.");
        return "";
    }
}
