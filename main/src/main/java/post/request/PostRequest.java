package post.request;

public class PostRequest {

  String body;
  int userId;
  String title;

  public static void main(String[] args) {
    int n = 6;
    PostRequest postRequest = new PostRequest();
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
    StringBuilder sb = new StringBuilder(n);

    for (int i = 0; i < n; i++) {
      int index = (int) (AlphaNumericString.length() * Math.random());
      sb.append(AlphaNumericString.charAt(index));
    }

    postRequest.title = "title for test " + sb.toString();
    postRequest.body = "foo";
    postRequest.userId = 1;

    System.out.println(postRequest.title);
    System.out.println(postRequest.body);
    System.out.println(postRequest.userId);
  }
}