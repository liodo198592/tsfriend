package com.example.demo.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HomeController {
 
    @RequestMapping("/")
    public String home(){
        return "你好，欢迎来到tsfriend";
    }
}