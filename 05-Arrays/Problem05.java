import java.util.ArrayList;
import java.util.List;

public class Problem05 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int n = candies.length;
    int maxCandies = candies[0];
    for (int i = 1; i < n; i++) {
      if (maxCandies < candies[i]) {
        maxCandies = candies[i];
      }
    }
    List<Boolean> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (candies[i] + extraCandies >= maxCandies) {
        arr.add(true);
      } else
        arr.add(false);
    }
    return arr;
  }
}