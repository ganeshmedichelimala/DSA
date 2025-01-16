
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;

public class Problem24 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    while (true) {
      System.out.println("Enter the number = ");
      int n = in.nextInt();
      sum += n;
      if (n == 0) {
        System.out.println("Sum = " + sum);
        break;
      }
    }
    in.close();
  }
}
