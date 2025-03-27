package org.example;

//El test ha sido creado entrando en main->java->org.example-> HelloWorld.
//Boton derecho sobre el nombre de la clase->Generate-> Test -> Y he elegido Junit4 y marcado el metodo helloWorld

//Para una prueba POJO, la clase debe tener como nombre xxxTest y el metodo testxxx
//Para ejecutarlo. Pulsar en el menu Maven -> test

public class HelloWorldTest {

    public void testgethello() {
        HelloWorld helloWorld = new HelloWorld();
        assert ("Hello World").equals(helloWorld.gethello());

    }
}