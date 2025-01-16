
// Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class Problem22 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENter the Integer : ");
    int n = in.nextInt();
    int sum = 0;
    int product = 1;
    while (n > 0) {
      int ld = n % 10;
      sum += ld;
      product *= ld;
      n /= 10;
    }
    int diff = product - sum;
    System.out.println("The sum = " + sum);
    System.out.println("The Product = " + product);
    System.out.println("The difference = " + diff);
    in.close();
  }
}
