package com.ttn.commonutils;

public class ResourceHelper {
    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        return basePath + path;
    }
}
