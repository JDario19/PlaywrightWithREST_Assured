package com.practice.automation.api;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class ProductsApiTest extends BaseApiTest {

    @Test
    public void getProductsList() {
        requestSpec
            .when()
                .get("/api/productsList")
            .then()
                .log().all()
                .statusCode(200)
                .body("products", not(empty()));
    }
}
