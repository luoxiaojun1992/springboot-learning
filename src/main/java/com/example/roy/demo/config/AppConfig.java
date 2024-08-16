package com.example.roy.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@lombok.Getter
public class AppConfig {
    @Value("${spring.application.name}")
    public String name;
}
