// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Problem01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();

    System.out.println(max(num1, num2, num3));
    System.out.println(min(num1, num2, num3));
    in.close();

  }

  static int max(int num1, int num2, int num3) {
    if (num1 > num2 && num1 > num3) {
      return num1;
    } else if (num2 > num1 && num2 > num3) {
      return num2;
    } else {
      return num3;
    }
  }

  static int min(int num1, int num2, int num3) {
    if (num1 < num2 && num1 < num3) {
      return num1;
    } else if (num2 < num1 && num2 < num3) {
      return num2;
    } else {
      return num3;
    }
  }

}
