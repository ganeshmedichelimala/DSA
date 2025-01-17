
public class Problem02 {
  public int reverse(int x) {
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x = x * -1;
    }
    int rev = 0;
    while (x > 0) {
      int ld = x % 10;
      if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && ld > 7) {
        return 0;
      }
      if (rev == Integer.MAX_VALUE / 10 && ld > 7) {
        return 0;
      }
      rev = rev * 10 + ld;

      x = x / 10;
    }
    if (isNegative) {
      return rev * -1;
    }
    return rev;
  }
}
