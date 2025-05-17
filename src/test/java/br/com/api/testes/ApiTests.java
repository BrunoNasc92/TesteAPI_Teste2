package br.com.api.testes;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.qameta.allure.junit5.AllureJunit5;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(AllureJunit5.class)
@Epic("Testes de API")
@Feature("Validação dos endpoints")
public class ApiTests {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.filters(new AllureRestAssured()); // Ativa o filtro do Allure para todas as requisições
    }

    @Test
    @Story("Valida o endpoint GET /posts/1")
    @Description("Teste que valida se o endpoint GET /posts/1 retorna o status 200 e dados corretos.")
    @Severity(SeverityLevel.NORMAL)
    public void testGetPosts() {
        given()
        .when()
            .get("/posts")
        .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("size()", greaterThan(0));
    }

    @Test
    public void testPostCreate() {
        given()
            .contentType(ContentType.JSON)
            .body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }")
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("foo"))
            .body("body", equalTo("bar"))
            .body("userId", equalTo(1));
    }

    @Test
    public void testPutUpdate() {
        given()
            .contentType(ContentType.JSON)
            .body("{ \"id\": 1, \"title\": \"updated\", \"body\": \"updated body\", \"userId\": 1 }")
        .when()
            .put("/posts/1")
        .then()
            .statusCode(200)
            .body("title", equalTo("updated"));
    }

    @Test
    public void testDeletePost() {
        given()
        .when()
            .delete("/posts/1")
        .then()
            .statusCode(anyOf(is(200), is(204))); // Algumas APIs retornam 204 no delete
    }
}
