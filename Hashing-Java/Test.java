
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    int[] hash = new int[13];
    for (int i = 0; i < n; i++) {
      hash[arr[i]] += 1;
    }
    int q = in.nextInt();
    while (q > 0) {
      int target = in.nextInt();
      System.out.println(hash[target]);
      q--;
    }
    in.close();
  }

}
