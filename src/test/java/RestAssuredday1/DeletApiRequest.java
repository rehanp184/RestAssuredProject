package RestAssuredday1;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeletApiRequest {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000"	;
		RequestSpecification request=  RestAssured.given();
		Header myHeader = new Header("Content-Type", "application/json");
		Header myHeader2 = new Header("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ4MzY2MzYyMzg3LCJleHBpcmVfYXQiOjE2NTM1NTAzNjIzODcsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.hRpm4RI3XS0lwG_-V78269vxj4548KWhWuD17Q3DSVU");
		Headers headers = new Headers(myHeader,myHeader2);
		request.headers(headers);
		Response response =	request.delete("/api/v1/products/23546823");
		System.out.println(response.asPrettyString());

	}

}
