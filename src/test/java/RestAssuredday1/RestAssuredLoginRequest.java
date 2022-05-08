package RestAssuredday1;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredLoginRequest {

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000"	;
		RequestSpecification request=  RestAssured.given();
		Header myHeader = new Header("Content-Type", "application/json");
		 request.header(myHeader);
		 request.body("{\r\n"
		 		+ "		\"email\": \"jatinvsharma@gmail.com\",\r\n"
		 		+ "		\"password\":\"123123123\"\r\n"
		 		+ "}");
		 Response response = request.post("/user/signin");
		 System.out.println(response.asPrettyString());
		 
	
		
	}

}
