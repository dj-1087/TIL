import java.util.StringTokenizer;

public class test {
  public static void main(String[] args) {
    String name = "한글";
    StringTokenizer st = new StringTokenizer("한글, 안돼", ",");
    System.out.println(st.nextToken());
    System.out.println(st.nextToken());
    System.out.println(name);
  }
}
