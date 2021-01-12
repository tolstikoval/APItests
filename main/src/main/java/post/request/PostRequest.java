package post.request;

import post.response.PostResponse;

import java.util.ArrayList;
import java.util.List;

public class PostRequest {
Unirest.setTimeouts(0, 0);
  PostResponse<String> response = Unirest.post("https://jsonplaceholder.typicode.com/posts")
          .header("Content-Type", "application/json")
          .header("Cookie", "__cfduid=d251dc7412395e651ea7e6d6139bdaaf91610459685")
          .body("{\n\t\"method\": \"POST\",\n    \"title\": \"fooo 556dhdd\",\n    \"body\": \"barscdcd44jjhhjffd\",\n    \"userId\": 1\n}")
          .asString();

//  PostRequest postRequest = new PostRequest().generation();
//  String  title;
//  String  body;
//  int     userId;
//
//  private PostRequest generation() {
//  int a = 2;
//  return a;
//  }
}
