// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Problem10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    palindrome(n);
    in.close();
  }

  static void palindrome(int n) {
    int rev = 0, temp = n;
    while (n > 0) {
      int ld = n % 10;
      rev = rev * 10 + ld;
      n /= 10;
    }
    if (rev == temp) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }

  }
}
