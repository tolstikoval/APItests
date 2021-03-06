package post.request;

public class PostRequest {

  String body;
  long userId;
  String title;

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    return this;
  }

  public long getUserId() {
    return userId;
  }

  public PostRequest setUserId(long userId) {
    this.userId = userId;
    return this;
  }

  public PostRequest buildPostRequest() {
    this.title = setTitle("title for test " + generateTitle(6));
    this.body = setBody("foo");
    this.userId = setUserId(1);
    return this;
  }

  private String generate(int n) {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {
      int index = (int) (AlphaNumericString.length() * Math.random());
      sb.append(AlphaNumericString.charAt(index));
    }
    return sb.toString();
  }
  /*  public static void main(String[] args) {
    PostRequest postRequest = new PostRequest();
    postRequest = postRequest.buildPostRequest();
    System.out.println(postRequest.title);
    System.out.println(postRequest.body);
    System.out.println(postRequest.userId);
  }*/
}