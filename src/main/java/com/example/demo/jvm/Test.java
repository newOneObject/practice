package com.example.demo.jvm;

public class Test {

    private static String a = "1";

    private String arg = "2";

    public Test staticMethod(String args) {
        this.arg = args;
        return this;
    }
}
