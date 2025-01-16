// Input a year and find whether it is a leap year or not.
import java.util.*;

public class Program1 {
  public static void main(String[] args) {
    System.out.print("Enter the Year : ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year % 4 == 0){
      if(year % 100 == 0) {
        if(year % 400 == 0) {
          System.out.println("Leap year");
        } 
        else {
          System.out.println("Not Leap Year");
        }
      } else{
        System.out.println("Leap Year");
      }
    } 
    else {
      System.out.println("Not a Leap Year");
    }
    sc.close();
  }
}
