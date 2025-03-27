package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void gethello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.gethello());
    }
}