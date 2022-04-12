package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class GreetingServiceTest {

    @Test
    public void testHelloWorldEndpoint() {
        given()
                .when().get("/helloworld?wsdl")
                .then()
                .statusCode(200);
    }

    @Test
    void testMetricsEndpoint() {
        given()
                .when().get("/q/metrics")
                .then()
                .statusCode(200);
    }
}
