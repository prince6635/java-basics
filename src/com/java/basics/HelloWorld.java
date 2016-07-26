package com.java.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("testing...");
    }

    public void testException() throws FileNotFoundException {
        System.out.println("start testing exception...");
        FileInputStream fs = new FileInputStream("");
    }

    public void testPrint() {
        System.out.println("start testing print...");
    }
}
