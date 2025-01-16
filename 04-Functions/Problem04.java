import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.
public class Problem04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int sum = sum(n1, n2);
    System.out.println("Sum = " + sum);
    in.close();
  }

  static int sum(int n1, int n2) {
    return n1 + n2;
  }
}
