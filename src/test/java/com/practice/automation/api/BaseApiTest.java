package com.practice.automation.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseApiTest {

    protected RequestSpecification requestSpec;

    @BeforeClass
    public void setupApi() {
        RestAssured.baseURI = "https://automationexercise.com";
        requestSpec = RestAssured.given().baseUri(RestAssured.baseURI).log().all();
    }
}
