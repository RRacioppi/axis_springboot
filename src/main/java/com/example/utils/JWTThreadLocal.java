package com.example.utils;

public class JWTThreadLocal {
    private static ThreadLocal<String> jwt = new ThreadLocal();

    public JWTThreadLocal() {
    }

    public static ThreadLocal<String> getJwt() {
        return jwt;
    }
}
