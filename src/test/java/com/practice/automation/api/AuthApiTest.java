package com.practice.automation.api;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class AuthApiTest extends BaseApiTest {

    @Test
    public void invalidLoginShouldFail() {
        String payload = """
            {
              "email": "fake@test.com",
              "password": "wrongpass"
            }
        """;

        requestSpec
            .header("Content-Type", "application/json")
            .body(payload)
        .when()
            .post("/api/verifyLogin")
        .then()
            .log().all()
            .statusCode(200)
            .body("responseCode", not(equalTo(200)));
    }
}
