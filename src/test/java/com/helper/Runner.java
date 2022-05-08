package com.helper;

import com.RestAssuredTutorialPojo.Ibody;
import com.RestAssuredTutorialPojo.LoginCredential;
import com.RestAssuredTutorialPojo.ProductData;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class Runner {

	public static void main(String[] args) {
		
		 Ibody body=new LoginCredential("jatinvsharma@gmail.com", "123123123");
		Apihelperclass helper=new Apihelperclass();
		
		String token=helper.makeRequest( verbs.POST, "/user/signin", body, new Header("content-type", "application/json")).
		then().log().all().extract().jsonPath().getString("data.token");
		System.out.println(token);
		
		
	 Ibody pbody=new ProductData("abc", "test", "3435");
	    int productID = helper.makeRequest(verbs.POST,"/api/v1/products",  pbody, new Header("content-type", "application/json"),
	          new Header("authorization", token)).then().log().all().extract().path("data.id");
	   
	     
	   helper.makeRequest(verbs.GET,"/api/v1/products/"+productID,  new Header("authorization", token)).then().log().all();
	   System.out.println(productID);
	   
	  
	   helper.makeRequest(verbs.PUT,"/api/v1/products/"+productID,  new ProductData("abcd", "test1", "3435"),
			  new Header("content-type", "application/json"),
	          new Header("authorization", token)).then().log().all();
	   
      helper.makeRequest(verbs.DELETE, "/api/v1/products/"+productID, new Header("content-type", "application/json"),
			   new Header("authorization", token))
	          .then().log().all();
	   
	    }

}
