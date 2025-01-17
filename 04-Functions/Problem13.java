// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Problem13 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int start = in.nextInt();
    int end = in.nextInt();
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    in.close();
  }

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
