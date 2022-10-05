package com.example.router;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletTelegram implements ServletContextListener {
    private static final String BOT_TOKEN = "5417168592:AAG6-FZGMZgHv4uII3Ql34aHkEbmIqw_UCw";
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("---------------------------------------------");
        TelegramBotApplication application = TelegramBotSingleton.getInstance();
        application.run();
    }
}
