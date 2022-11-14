package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class productInputController {
    @PostMapping("/ProductConfirmationServlet")
    public String product(ProductForm form){
        return "Product";
    }

    @PostMapping("")
    public String productCheck(){
        return "ProductCheck method is work";
    }
}
