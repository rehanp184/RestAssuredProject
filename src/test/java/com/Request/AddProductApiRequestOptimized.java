package com.Request;

import static io.restassured.RestAssured.*;

import org.apache.http.client.protocol.ResponseContentEncoding;
import org.hamcrest.Matchers;

import com.RestAssuredTutorialPojo.LoginCredential;
import com.RestAssuredTutorialPojo.AddProduct;
import com.utilconfig.testUtiles;

import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.AND;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class AddProductApiRequestOptimized {

	public static void main(String[] args) {
		
	     
		//baseURI="http://localhost:3000";
		baseURI= testUtiles.readConfigfile("dev.properties", "BASE_URL");
		given().headers(new Headers(new Header("Content-Type", "application/json"),
				new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjUxOTQyMDA3MDU3LCJleHBpcmVfYXQiOjE2NTcxMjYwMDcwNTgsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.Wrln_cm6pa-f4Xt70YQkAlO5YYViyMVLAA-HUsn6JDQ"))).and().body
						(new AddProduct("Samsung s20 ultra","100 px camera", "49000").toJson())
						.when().post("/api/v1/products")
						.then().assertThat().and().statusCode(200).log().all();
						
		//System.out.println(response.asPrettyString());

	}

}
