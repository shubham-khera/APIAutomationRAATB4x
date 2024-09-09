package org.example;

import io.restassured.RestAssured;
// import org.junit.Test;
import org.testng.annotations.Test;


public class RATestNG {
    @Test
    public void getRequest(){
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().then().log().all()
                .statusCode(201);
    }
}
