// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits

import java.util.Scanner;

class Problem01 {
  static int evenlyDivides(int n) {
    int original = n;
    int count = 0;

    while (n > 0) {
      int ld = n % 10;
      if (ld != 0 && original % ld == 0) {
        count++;
      }
      n /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    System.out.println("Count of digits that evenly divide the number: " + evenlyDivides(n));
    scanner.close();
  }
}
