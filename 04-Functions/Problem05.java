import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.
public class Problem05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int mul = mul(in.nextInt(), in.nextInt());
    System.out.println("MUL = " + mul);
    in.close();
  }

  static int mul(int n1, int n2) {
    return n1 * n2;
  }

}
