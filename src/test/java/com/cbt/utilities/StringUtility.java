package com.cbt.utilities;

public class StringUtility {

    public static String verifyEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)){
            return "PASS";
        }else{
            return "FAIL";
        }

    }

}
