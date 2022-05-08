package com.OptimizedRestAssuredDay2;

import static io.restassured.RestAssured.*;

import com.RestAssuredTutorialPojo.LoginCredential;
import com.utilconfig.testUtiles;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class RestAssuredLoginOptimiseRequest {

	public static void main(String[] args) {
		baseURI= testUtiles.readConfigfile("dev.properties", "BASE_URL");
		 Response response =given().when().header(new Header("Content-Type", "application/json")).and()
				 .body(new LoginCredential("jatinvsharma@gmail.com","123123123").toJson()).post("/user/signin");
		 
		 System.out.println(response.asPrettyString());
		
		

	}

}
