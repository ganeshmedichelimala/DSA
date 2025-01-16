// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Problem03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    eligible(age);
  }

  static void eligible(int age) {
    if (age >= 18) {
      System.out.println("Eligible to Vote");
    } else {
      System.out.println("Not Eligible to Vote");
    }
  }
}
