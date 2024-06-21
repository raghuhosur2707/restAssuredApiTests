package finalTest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.Constants;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Create_Resource {
	
	
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
        
                post("/api/users").
                
                
        
        then().
                statusCode(201).
                
                header("Content-Type", "application/json; charset=utf-8").
                header("Content-Type", equalTo("application/json; charset=utf-8")).
                   
                body("name", equalTo("Raghavendra H")).
                
                log().all();
        

        
        
    }



}
