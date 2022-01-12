package com.swufe.javaee.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalTime;
import java.util.logging.*;

@WebListener
public class LogListener implements ServletRequestListener {
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        try {
            // Windows: C:\\Users\\zhongpu\\Desktop\\requests.log
            Handler handler = new FileHandler("/Users/zhongpu/Desktop/requests.log", true);
            LOGGER.addHandler(handler);
            handler.setLevel(Level.ALL);
            handler.setFormatter(new SimpleFormatter());
            LocalTime now = LocalTime.now();
            String method = request.getMethod();
            String path1 = request.getContextPath();
            String path2 = request.getServletPath();
            String s = "%s %s %s%s";
            String msg = String.format(s, now.toString(), method, path1, path2);
            LOGGER.info(msg);
            handler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
