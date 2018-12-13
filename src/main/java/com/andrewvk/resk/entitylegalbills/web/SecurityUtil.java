package com.andrewvk.resk.entitylegalbills.web;

public class SecurityUtil {
    private static final int DEFAULT_ID_DEPARTMENT = 401;

    private SecurityUtil() {
    }

    public static int authUserIdDepartment() {
        return DEFAULT_ID_DEPARTMENT;
    }
}
