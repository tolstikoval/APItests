package post;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import  io.restassured.matcher.RestAssuredMatchers.*;
import  org.hamcrest.Matchers.*;

public class PostsMethods {
  public Response testMethod() {
    Response response = doGetRequest("https://jsonplaceholder.typicode.com/users");

    List<String> jsonResponse = response.jsonPath().getList("$");

    System.out.println(jsonResponse.size());
  }

    public static Response doGetRequest(String endpoint) {
      RestAssured.defaultParser = Parser.JSON;

      return
              given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                      when().get(endpoint).
                      then().contentType(ContentType.JSON).extract().response();
    }

  }


