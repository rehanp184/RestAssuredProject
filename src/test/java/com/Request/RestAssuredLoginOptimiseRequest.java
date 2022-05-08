package com.Request;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import com.RestAssuredTutorialPojo.LoginCredential;
import com.utilconfig.testUtiles;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class RestAssuredLoginOptimiseRequest {

	public static void main(String[] args) {
		baseURI= testUtiles.readConfigfile("dev.properties", "BASE_URL");
		
		given().header(new Header("Content-Type", "application/json")).and()
				 .body(new LoginCredential("jatinvsharma@gmail.com","123123123").toJson())
				 .when().post("/user/signin")
				 .then()
				 .assertThat()
				 .statusCode(200)
				 .log().all()
				  .and()
				  .body("status", Matchers.equalTo("success"));
	
		 
		// System.out.println(response.asPrettyString());
		
		

	}

}
