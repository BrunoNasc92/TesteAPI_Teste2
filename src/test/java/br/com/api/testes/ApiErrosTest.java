package br.com.api.testes;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiErrosTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://httpstat.us"; // Usado para simular respostas HTTP
    }

    @Test
    public void testBadRequest400() {
        when()
            .get("/400") // Simula Bad Request
        .then()
            .statusCode(400);
    }

    @Test
    public void testUnauthorized401() {
        when()
            .get("/401") // Simula Unauthorized
        .then()
            .statusCode(401);
    }

    @Test
    public void testForbidden403() {
        when()
            .get("/403") // Simula Forbidden
        .then()
            .statusCode(403);
    }

    @Test
    public void testNotFound404() {
        when()
            .get("/404") // Simula Not Found
        .then()
            .statusCode(404);
    }

    @Test
    public void testInternalServerError500() {
        when()
            .get("/500") // Simula Internal Server Error
        .then()
            .statusCode(500);
    }
}
