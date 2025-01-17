// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Problem14 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(sumOfN(n));
    in.close();
  }

  static int sumOfN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
