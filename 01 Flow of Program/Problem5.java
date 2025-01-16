// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;
public class Problem5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x value : ");
    int x = sc.nextInt();
    while(true) {
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n == x){
          System.out.println("Correct!");
          break;
        } 
        else {
          System.out.println("Incorrect! Try again");
        }
    }
    sc.close();

  }
  
}
