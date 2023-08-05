package com.upaio;

import com.upaio.models.ServiceRequestGreetings;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
class GreetingResourceTest {

    @Test
    public void testGetHelloEndpoint() {
        RestAssured.baseURI = "http://localhost:8080";
        String greeting = "Hello from RESTEasy Reactive";
        given()
                .queryParam("greeting", greeting)
                .when().get("/api")
                .then()
                .statusCode(200)
                .body("greeting", equalTo(greeting));
    }

    @Test
    public void testPostHelloEndpoint() {
        RestAssured.baseURI = "http://localhost:8080";

        // Crea el objeto ServiceRequestGreetings con el campo "greeting"
        ServiceRequestGreetings requestGreetings = new ServiceRequestGreetings();
        requestGreetings.setGreeting("Hello from the test");
        given()
                .contentType("application/json")
                .body(requestGreetings)
                .when().post("/api")
                .then()
                .statusCode(200)
                .body("greeting", equalTo("Hello from the test"));
    }

}