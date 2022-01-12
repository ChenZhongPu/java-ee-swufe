package com.swufe.javaee.listener;

public class DatabaseConn {
    private String conn;
    private String name;
    private String pwd;

    public DatabaseConn(String host, String user, String pwd, String db) {
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:postgresql://");
        sb.append(host);
        sb.append("/");
        sb.append(db);
        conn = sb.toString();
        name = user;
        this.pwd = pwd;
    }

    public String getConn() {
        return conn;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
