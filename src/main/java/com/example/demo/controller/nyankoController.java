package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nyankoController {
    @PostMapping("/nyankoController")
    public String nyankoCheck(){
        System.out.println();
        return "";
    }
}
