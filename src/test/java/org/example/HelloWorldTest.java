package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//El test ha sido creado entrando en main->java->org.example-> HelloWorld.
//Boton derecho sobre el nombre de la clase->Generate-> Test -> Y he elegido Junit4 y marcado el metodo helloWorld

//Para una prueba Junit4, la clase debe tener como nombre xxxTest y delante del metodo hay que poner @Test
//Incluir en el pom.xml la dependencia de Junit4

//Para ejecutarlo. Pulsar en el menu Maven -> test
public class HelloWorldTest {

    @Test
    public void gethello() {
        HelloWorld helloWorld = new HelloWorld();

        assertEquals("Hello World",helloWorld.gethello());
    }
}