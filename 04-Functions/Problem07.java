
// Define a method to find out if a number is prime or not.4
import java.util.*;

public class Problem07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    isPrime(in.nextInt());
    in.close();
  }

  static void isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        System.out.println("Not a Prime");
        return;
      }
    }
    System.out.println("Prime");
  }
}
