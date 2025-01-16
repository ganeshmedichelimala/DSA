// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Problem25 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int largest = 0;
    while (true) {
      System.out.print("Enter the Number : ");
      int n = in.nextInt();
      if (n > largest) {
        largest = n;
      }
      if (n == 0) {
        break;
      }
    }
    System.out.println("Largest = " + largest);
    in.close();
  }
}
