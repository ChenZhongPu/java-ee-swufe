package com.swufe.javaee.toy_music.Utils;

public class AccountUtils {
    public static boolean checkLogin(String email, String pwd) {
        return email.equals(CONSTANTS.ADMIN_EMAIL) && pwd.equals(CONSTANTS.ADMIN_PWD);
    }
}
