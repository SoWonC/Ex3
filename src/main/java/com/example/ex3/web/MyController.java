package com.example.ex3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/main")
    public void main(){
        System.out.println("===================================main");
    }
}
