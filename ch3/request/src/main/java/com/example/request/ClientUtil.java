package com.example.request;

public class ClientUtil {
    public static String getClient(String agent) {
        if (agent.toLowerCase().contains("iphone")) {
            return "iPhone";
        } else if (agent.toLowerCase().contains("mac")) {
            return "Mac";
        } else if (agent.toLowerCase().contains("android")) {
            return "Android";
        } else if (agent.toLowerCase().contains("windows")) {
            return "Windows";
        } else {
            return "Other";
        }
    }

}
