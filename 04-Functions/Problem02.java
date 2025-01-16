import java.util.Scanner;

public class Problem02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    evenOdd(n);
    in.close();
  }

  static void evenOdd(int n) {
    if (n % 2 == 0) {
      System.out.println("EVEN");
    } else {
      System.out.println("ODD");
    }
  }
}
