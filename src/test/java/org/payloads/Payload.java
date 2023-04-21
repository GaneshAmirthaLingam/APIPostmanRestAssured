package org.payloads;

public class Payload {

	public static String addPlace() {
		
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"GANESH A\",\r\n" + 
				"  \"phone_number\": \"(+91) 8122394942\",\r\n" + 
				"  \"address\": \"27, 2nd Cross Street, Dharmapuri, Muthirapalayam\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"Landmark Pillayar Kovil\",\r\n" + 
				"    \"WaterTank\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
		
	}

	public static String CoursePrice() {
		return " {\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 1162,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Appium\",\r\n" + 
				"      \"price\": 36,\r\n" + 
				"      \"copies\": 7\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		
	}
	
	/*public static String addBook() {
		String payload="{\r\n" + 
		"\r\n" + 
		"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
		"\"isbn\":\"bcd\",\r\n" + 
		"\"aisle\":\"bcd227\",\r\n" + 
		"\"author\":\"John foe\"\r\n" + 
		"}\r\n" +
		" \r\n" +
		"";
		return payload;
	}
*/

	public static String addBook(String aisle, String isbn) {// aisle, isbn is a variable directly input to payload, "+aisle+", "+isbn+" (concatiantion operator)
		String payload="{\r\n" + 
		"\r\n" + 
		"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
		"\"isbn\":\""+aisle+"\",\r\n" + 
		"\"aisle\":\""+isbn+"\",\r\n" + 
		"\"author\":\"John foe\"\r\n" + 
		"}\r\n" +
		" \r\n" +
		"";
		return payload;
	}

}
