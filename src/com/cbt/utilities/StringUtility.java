package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            return "PASS";
        }
        return "FAIL";
    }
}
