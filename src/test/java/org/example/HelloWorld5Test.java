package org.example;

import org.junit.jupiter.api.Test;

//Test con Junit5
public class HelloWorld5Test {
    @Test
    void getHello5() {
        HelloWorld helloWorld = new HelloWorld();

        assert ("Hello World").equals(helloWorld.gethello());
        System.out.println("Test con JUnit5");
    }
}
