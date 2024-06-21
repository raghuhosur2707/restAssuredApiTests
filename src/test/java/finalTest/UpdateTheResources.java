package finalTest;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

public class UpdateTheResources {
	
	@Test

	public void verifyLisyUserTest() {
	        
	        baseURI = Constants.baseURI;
	        
	        
	        JSONObject requestBody = new JSONObject();
	        requestBody.put("name", "Raghavendra H");
	        requestBody.put("job", "leader");
	        
	        
	        
	        System.out.println("====================================================");
	        
	        
	        System.out.println(requestBody.toJSONString());
	        
	        System.out.println("====================================================");
	        //====================================================
	        
	        
	        given().
	        
	                //header
	                headers("Content-Type", "application/json").
	                header("Content-Type",ContentType.JSON).
	                //body
	                
	                body(requestBody.toJSONString()).
	                
	                //auth
	                
	        
	        
	        when().
	        
	                put("/api/users/2").
	                
	                
	        
	        then().
	                statusCode(200).
	                
	                header("Content-Type", "application/json; charset=utf-8").
	                header("Content-Type", equalTo("application/json; charset=utf-8")).
	                
	                
	                body("name", equalTo("Raghavendra H")).
	                body("job", equalTo("leader")).
	                
	                log().all();
	        
	        
	        
	        
	    }




}
