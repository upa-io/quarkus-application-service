package com.upaio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceResponseGreetingsTest {

    @Test
     void testEqualsAndHashCode() {
        // Crear dos objetos ServiceRequestGreetings con los mismos valores
        ServiceRequestGreetings greeting1 = new ServiceRequestGreetings();
        greeting1.setGreeting("Hi");
        ServiceRequestGreetings greeting2 = new ServiceRequestGreetings();
        greeting2.setGreeting("Hi");

        // Verificar que equals() devuelve true cuando los objetos tienen los mismos valores
        Assertions.assertEquals(greeting1, greeting2);

        // Verificar que hashCode() devuelve el mismo valor para objetos con los mismos valores
        Assertions.assertEquals(greeting1.hashCode(), greeting2.hashCode());
    }

    @Test
     void testToString() {
        // Crear un objeto ServiceRequestGreetings
        ServiceRequestGreetings greeting = new ServiceRequestGreetings();
        greeting.setGreeting("Hi");

        // Verificar que toString() genera la representación correcta del objeto
        Assertions.assertEquals("ServiceRequestGreetings(greeting=Hi)", greeting.toString());
    }

    @Test
     void testGettersAndSetters() {
        // Crear un objeto ServiceRequestGreetings
        ServiceRequestGreetings greeting = new ServiceRequestGreetings();
        greeting.setGreeting("Hi");

        // Verificar que los getters devuelven el valor correcto
        Assertions.assertEquals("Hi", greeting.getGreeting());

        // Verificar que los setters actualizan correctamente el valor
        greeting.setGreeting("Hi again");
        Assertions.assertEquals("Hi again", greeting.getGreeting());
    }
}