package com.swufe.javaee.request_response.utils;

public class Client {
    private String os;
    private String browser;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Client(String os, String browser) {
        this.os = os;
        this.browser = browser;
    }
}
