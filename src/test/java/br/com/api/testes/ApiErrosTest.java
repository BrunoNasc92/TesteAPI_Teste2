package br.com.api.testes;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class ApiErrosTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://httpstat.us";
    }

    private RequestSpecification request() {
        return RestAssured.given().filter(new AllureRestAssured());
    }

    @Test
    public void testBadRequest400() {
        request()
            .when().get("/400")
            .then().statusCode(400);
    }

    @Test
    public void testUnauthorized401() {
        request()
            .when().get("/401")
            .then().statusCode(401);
    }

    @Test
    public void testForbidden403() {
        request()
            .when().get("/403")
            .then().statusCode(403);
    }

    @Test
    public void testNotFound404() {
        request()
            .when().get("/404")
            .then().statusCode(404);
    }

    @Test
    public void testInternalServerError500() {
        request()
            .when().get("/500")
            .then().statusCode(500);
    }
}
