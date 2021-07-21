package com.ctzn.springctxdispservlet.v1.controller;

import com.ctzn.springctxdispservlet.shared.service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ApplicationContext applicationContext;

    private final SharedService sharedService;

    public TestController(SharedService sharedService) {
        this.sharedService = sharedService;
    }

    @GetMapping
    String test() {
        return "<strong>API v.1</strong><br>" +
                "Application context: " + applicationContext.getDisplayName() + "<br>" +
                "Application context parent: " + applicationContext.getParent() + "<br>" +
                sharedService.getMessage();
    }

}
