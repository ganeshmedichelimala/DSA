// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1

import java.util.Scanner;

public class Problem09 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int factorial = factorial(n);
    System.out.println(factorial);
    in.close();
  }

  static int factorial(int n) {
    if (n == 1) {
      return 1;

    }
    if (n == 0) {
      return 1;
    }
    int ans = 1;
    for (int i = n; i >= 1; i--) {
      ans = ans * i;
    }
    return ans;
  }
}
