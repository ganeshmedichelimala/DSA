
public class Problem07 {
  public boolean isPalindrome(String s) {
    String validString = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        validString += (char) (ch + 32);
      }
      if (ch >= 'a' && ch <= 'z') {
        validString += ch;
      }
      if (ch >= '0' && ch <= '9') {
        validString += ch;
      }
    }
    int left = 0;
    int right = validString.length() - 1;
    return valid(left, right, validString);
  }

  static boolean valid(int left, int right, String validString) {
    if (left >= right) {
      return true;
    }
    char ch1 = validString.charAt(left);
    char ch2 = validString.charAt(right);
    if (ch1 != ch2) {
      return false;
    }
    return valid(left + 1, right - 1, validString);
  }
}
