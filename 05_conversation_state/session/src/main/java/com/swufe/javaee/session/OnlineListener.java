package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class OnlineListener implements HttpSessionListener {
    static private int onlinePeople;
    public OnlineListener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        onlinePeople++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        onlinePeople--;
    }

    public static int getOnlinePeople() {
        return onlinePeople;
    }
}
