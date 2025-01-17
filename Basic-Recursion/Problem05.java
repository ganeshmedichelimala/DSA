import java.util.ArrayList;

public class Problem05 {
  public ArrayList<Long> factorialNumbers(long n) {
    ArrayList<Long> result = new ArrayList<>();
    findFactorials(1, 1, n, result);
    return result;
  }

  private void findFactorials(long current, long fact, long n, ArrayList<Long> result) {

    if (fact > n) {
      return;
    }
    result.add(fact);
    findFactorials(current + 1, fact * (current + 1), n, result);
  }
}
