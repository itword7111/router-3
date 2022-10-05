package com.example.router;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;

public class Publisher implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        new Thread(() -> {
            Endpoint.publish("http://localhost:8082/ws/router", new RouterSenderServiceImpl());
        }).start();
        System.out.println("---------------------------------------------");

    }
}
