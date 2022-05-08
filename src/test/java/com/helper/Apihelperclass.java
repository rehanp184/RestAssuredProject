package com.helper;

import java.util.ArrayList;
import java.util.List;

import com.RestAssuredTutorialPojo.Ibody;
import com.utilconfig.testUtiles;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Apihelperclass {
	List<Header> headerList=new ArrayList<Header>();
	Ibody ibody;
	public  Response makeRequest(verbs httpVerb, String endPoint, Object... requestData)
	{

		baseURI=testUtiles.readConfigfile("dev.properties", "BASE_URL");
	    Response response= null;
		
		for (Object d:requestData){
			if (d instanceof Header){
				headerList.add((Header) d);
			}
			else if (d instanceof Ibody){
				ibody=(Ibody) d;
			}
		}
				if (verbs.GET == httpVerb){
				response= given().when().headers(new Headers(headerList)).and().body(ibody.toJson()).get(endPoint);
				}else if (verbs.POST == httpVerb){
					response=	given().when().headers (new Headers(headerList)).and().body(ibody.toJson()).post(endPoint);
				}else if (verbs.PUT == httpVerb){
					response=	given().when(). headers (new Headers(headerList)).and().body(ibody.toJson()).post(endPoint);
				}else if (verbs.DELETE == httpVerb){
				response=	given().when(). headers (new Headers(headerList)).and().body(ibody.toJson()).post(endPoint);
				}
				
				return response;		

	}
	
	
	
}