
public class Problem03 {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int original = x;
    int rev = 0;
    while (x > 0) {
      int ld = x % 10;
      rev = rev * 10 + ld;
      x = x / 10;
    }
    if (rev == original) {
      return true;
    }
    return false;

  }
}
