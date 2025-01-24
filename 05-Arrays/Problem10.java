import java.util.List;

public class Problem10 {
  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count = 0, j = 0;
    if (ruleKey.equals("color")) {
      j = 1;
    } else if (ruleKey.equals("name")) {
      j = 2;
    }
    for (int i = 0; i < items.size(); i++) {
      if (ruleValue.equals(items.get(i).get(j))) {
        count++;
      }
    }
    return count;
  }
}
