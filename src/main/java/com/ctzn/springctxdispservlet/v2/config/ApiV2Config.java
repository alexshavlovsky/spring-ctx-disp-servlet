package com.ctzn.springctxdispservlet.v2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.ctzn.springctxdispservlet.v2"})
@EnableWebMvc
public class ApiV2Config {
}
