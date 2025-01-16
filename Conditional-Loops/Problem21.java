
// Fibonacci Series In Java Programs
import java.util.Scanner;

public class Problem21 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the nth Value : ");
    int n = in.nextInt();
    int p = 0;
    int c = 1;
    int count = 2;
    while (count <= n) {
      int temp = c;
      c = c + p;
      p = temp;

      count++;
    }
    System.out.println(c);
    in.close();

  }
}
