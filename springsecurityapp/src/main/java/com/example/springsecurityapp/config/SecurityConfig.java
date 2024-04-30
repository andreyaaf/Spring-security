package com.example.springsecurityapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity



public class SecurityConfig {
    private final HttpSecurity httpSecurity;

    public SecurityConfig(HttpSecurity httpSecurity) {
        this.httpSecurity = httpSecurity;
    }

    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity HttpSecurity) throws Exception {
    return httpSecurity.build();
    }
}
