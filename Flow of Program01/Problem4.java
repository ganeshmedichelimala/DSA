// Take 2 numbers as inputs and find their HCF and LCM.
import java.util.*;
public class Problem4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter twp numbers : ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int hcf = 0;
    int lcm = 0;
    for(int i = n1; ; i++){
      if(i % n1 == 0 & i % n2 == 0){
        lcm = i;
        break;
      }
    }
    for(int i = n1; ; i--){
      if(n1 % i == 0 & n2 % i == 0){
        hcf = i;
        break;
      }
    }
    System.out.println("HCF = " + hcf);
    System.out.println("LCM = " + lcm);
    sc.close();
  }
}
