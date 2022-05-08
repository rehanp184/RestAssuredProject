package com.OptimizedRestAssuredDay2;

import static io.restassured.RestAssured.*;

import org.apache.http.client.protocol.ResponseContentEncoding;

import com.RestAssuredTutorialPojo.LoginCredential;
import com.RestAssuredTutorialPojo.AddProduct;

import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class AddProductApiRequestOptimized {

	public static void main(String[] args) {
		
	     
		baseURI="http://localhost:3000";
		Response response=given().when().headers(new Headers(new Header("Content-Type", "application/json"),
				new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ4NDUxMjMyNTI0LCJleHBpcmVfYXQiOjE2NTM2MzUyMzI1MjUsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.aKkdpvFamU3-LCQj-_GLdJuhTG_sHSJ2sVZVr9ad6WY"))).and().body
						(new AddProduct("Samsung s20 ultra","100 px camera", "49000").toJson()).post("/api/v1/products");
		
		
		System.out.println(response.asPrettyString());

	}

}
