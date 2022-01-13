package com.swufe.javaee.session2;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.concurrent.atomic.AtomicInteger;

@WebListener
public class SessionListener implements HttpSessionListener {
    private static final AtomicInteger COUNT = new AtomicInteger(0);

    public SessionListener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        COUNT.incrementAndGet();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        COUNT.decrementAndGet();
    }

    public static int getCOUNT() {
        return COUNT.get();
    }
}
