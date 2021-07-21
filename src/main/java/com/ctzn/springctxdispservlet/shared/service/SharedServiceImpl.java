package com.ctzn.springctxdispservlet.shared.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SharedServiceImpl implements SharedService {

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public String getMessage() {
        return "<br><strong>Message from shared service:</strong>" +
                "<br>Request ID: " + atomicInteger.incrementAndGet() + "_" + new Date().toInstant().toString() +
                "<br>Application context: " + applicationContext.getDisplayName() +
                "<br>Application context parent: " + applicationContext.getParent();
    }

}
