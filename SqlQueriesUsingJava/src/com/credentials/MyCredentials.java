package com.credentials;

import java.io.FileInputStream;
import java.util.Properties;

public class MyCredentials {
    public static String url;
    public static String user_Name;
    public static String password;

    static {
        try {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("config.properties"); // File in root folder
            props.load(fis);

            url = props.getProperty("db.url");
            user_Name = props.getProperty("db.username");
            password = props.getProperty("db.password");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
