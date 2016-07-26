package com.java.basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestHelloWorld {
    private HelloWorld hw;

    @Before
    public void before() {
        System.out.println("before..");
        hw = new HelloWorld();
    }

    @After
    public void after() {
        System.out.println("after..");
        hw = null;
    }

    @Test
    public void testHelloWorld() {
        try {
            hw.testException();
        } catch (Exception e) {
            assert(e.getClass().isInstance(new FileNotFoundException()));
        }
    }

    @Test
    public void testPrint() {
        hw.testPrint();
    }
}
