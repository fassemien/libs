package com.example.multimodule.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    public String message(){
        return "yes it'work";
    }
}
