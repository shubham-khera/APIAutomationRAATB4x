package org.example;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {
        // Code
        // Reports -> Allure Report
        // Run the Testcase -> TestNG
        // Work with API OR HTTP methods - Rest Assured

        // GET request
        // Fetch URL
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().then().log().all().statusCode(201);

    }
}
