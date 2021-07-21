package com.ctzn.springctxdispservlet.v1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.ctzn.springctxdispservlet.v1"})
@EnableWebMvc
public class ApiV1Config {
}
