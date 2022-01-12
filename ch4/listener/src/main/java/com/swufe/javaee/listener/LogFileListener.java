package com.swufe.javaee.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebListener
public class LogFileListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        String now = LocalTime.now().toString();
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        String method = request.getMethod();
        String context = request.getContextPath();
        String path = request.getServletPath();
        String s = "%s %s %s%s\n";
        String record = String.format(s, now, method, context, path);
        // Windows: C:\\Users\\zhongpu\\Desktop\\file.log
        Path p = Path.of("/Users/zhongpu/Desktop/file.log");
        try {
            Files.writeString(p, record, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
