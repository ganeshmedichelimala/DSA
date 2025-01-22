import java.util.Scanner;

public class CharacterHash {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    // pre storing
    int[] hash = new int[26];
    for (int i = 0; i < s.length(); i++) {
      hash[s.charAt(i) - 'a']++;
    }

    System.out.println(hash['c' - 'a']);
    in.close();
  }
}