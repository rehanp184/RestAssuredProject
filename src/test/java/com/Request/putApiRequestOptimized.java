package com.Request;

import static io.restassured.RestAssured.*;

import com.RestAssuredTutorialPojo.AddProduct;
import com.RestAssuredTutorialPojo.ProductData;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class putApiRequestOptimized {

	public static void main(String[] args) {
		
		baseURI="http://localhost:3000";
		Response response=given().when().headers(new Headers(new Header("Content-Type", "application/json"),
				new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ4NDUxMjMyNTI0LCJleHBpcmVfYXQiOjE2NTM2MzUyMzI1MjUsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.aKkdpvFamU3-LCQj-_GLdJuhTG_sHSJ2sVZVr9ad6WY"))).and().body
						(new ProductData("realme","8i", "490").toJson()).put("/api/v1/products/23546838");
		
		
		System.out.println(response.asPrettyString());

	

	}

}

