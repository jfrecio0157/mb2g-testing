package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

//Test con Junit4
public class HelloWorldTest {

    @Test
    public void gethello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.gethello());
    }
}