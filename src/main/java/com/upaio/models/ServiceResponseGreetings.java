package com.upaio.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

public class ServiceResponseGreetings implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "Saludo", example = "Hola")
    private String greeting;

    @JsonCreator
    public ServiceResponseGreetings() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
