package org.postMan;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.payloads.Payload;
import org.testng.Assert;

public class Basics {

	public static void main(String[] args) throws IOException {
		
		//validate if ADD place API is working as expected
		//Add place-> Update Place with New Address -> Get Place to validate if New Address is present in response.
		
		//Principles of API:
		// Given - all input details
		// When - submit the API - resource, http method
		// Then - validate the response
		// Content of the file to String-> Content of file can convert into Byte-> Byte data to String
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlace())
	//	.body(new String (Files.readAllBytes(Paths.get("src\\test\\java\\org\\payloads\\Payload.java"))))//static package called Files
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200) //remove log().all().
		.body("scope", equalTo("APP")) 		
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString(); 
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response); //for parsing Json
		String placeId = js.getString("place_id");
		
		System.out.println(placeId);
		
		//Update Place
		
		String newAddress = "Second Cross St, Dharmapuri, Muthirapalayam"; // declare new variable
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 		//remove placeID instead of ADD ("+placeId+")
				"\"address\":\""+newAddress+"\",\r\n" + 	//remove address instead of ADD "+newAddress+" Variable added. 
				"\"key\":\"qaclick123\"\r\n" + 
				"\r\n" + 
				"}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		//Get Place
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", "placeId")
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress); //Cucumber junit, TestNG Framework - Assertions
		
		
	}
	
	
}
