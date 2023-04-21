package org.postMan;

import org.payloads.Payload;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(Payload.CoursePrice());
	
		//Print No of courses returned by API
		
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print Title of the first course
		Object firstTitleCourse = js.get("courses[0].title");
		System.out.println(firstTitleCourse);
		
		//Print Price of the first course
		Object firstPriceCourse = js.get("courses[0].price");
		System.out.println(firstPriceCourse);
		
		//Print Copies of the first course
		Object firstCopies = js.get("courses[0].copies");
		System.out.println(firstCopies);
		
		//Print Title of the second course
		Object secondTitleCourse = js.get("courses[1].title");
		System.out.println(secondTitleCourse);

		//Print Price of the second course
		Object secondPriceCourse = js.get("courses[1].price");
		System.out.println(secondPriceCourse);
		
		//Print Copies of the second course
		Object secondCopies = js.get("courses[1].copies");
		System.out.println(secondCopies);
	
		System.out.println("Print no of copies sold by RPA Course");
		for (int i = 0; i < count; i++) {
			String courseTitles = js.get("courses["+i+"].title");
			
			if (courseTitles.equalsIgnoreCase("RPA")) {
				Object copies = js.get("courses["+i+"].copies");
				System.out.println(js.get("courses["+i+"].copies"));
				break;
	
			}
			/*System.out.println(js.get("courses["+i+"].title").toString());
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(js.get("courses["+i+"].copies").toString());
			
			System.out.println(courseTitles);*/
		}
	
	}

}
