package post.request;

public class PostRequest {

  String body;

  public long getUserId() {
    return userId;
  }

  public PostRequest setUserId(long userId) {
    this.userId = userId;
    return this;
  }

  long userId;
  String title;

  public static void main(String[] args) {
    PostRequest postRequest = new PostRequest();
    postRequest = postRequest.buildPostRequest();
    System.out.println(postRequest.title);
    System.out.println(postRequest.body);
    System.out.println(postRequest.userId);
  }
  public PostRequest buildPostRequest() {
    this.title = "title for test " + setTitle(6);
    this.body = "foo";
    this.userId = 1;
    return this;
  }

  private String setTitle(int n) {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {
      int index = (int) (AlphaNumericString.length() * Math.random());
      sb.append(AlphaNumericString.charAt(index));
    }
    return sb.toString();
  }
}