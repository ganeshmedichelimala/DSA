import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principle Amount : ");
    int p = sc.nextInt();
    System.out.println("Enter The interest rate :");
    float i = sc.nextFloat();
    System.out.println("Enter the Time (Years) : ");
    int t = sc.nextInt();

    double si = (p * i * t) / 100;
    System.out.println("Simple Interest = " + si);
    sc.close();
  }
}
