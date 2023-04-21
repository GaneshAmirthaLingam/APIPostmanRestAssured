package org.postMan;

import org.payloads.Payload;
import org.payloads.ReUsableMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	@Test(dataProvider="BooksData")
	public void addBook(String aisle, String isbn) {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().header("Content-Type","application/json").
	//	body(Payload.addBook()).
		body(Payload.addBook("ftc", "acd786")).
		when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().asString();
		JsonPath js = ReUsableMethods.rawToJson(response);
		String id = js.get("ID");
		System.out.println(id);
		
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData() {
		
		//array=collection of elements
		//multidimensional array= collection of arrays
		
		return new Object[][] {
			{"abc","123456"}, 
			{"def","345678"}, 
			{"ghi","6789101"}
	};
}
}
