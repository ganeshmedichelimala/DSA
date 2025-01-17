
public class Problem04 {
  public static int[] lcmAndGcd(int a, int b) {
    int[] ans = new int[2];

    ans[1] = gcd(a, b);

    ans[0] = (a * b) / ans[1];

    return ans;
  }

  private static int gcd(int a, int b) {
    for (int i = (int) Math.min(a, b); i >= 0; i--) {
      if (a % i == 0 && b % i == 0) {
        return i;
      }
    }
    return a;
  }
}
