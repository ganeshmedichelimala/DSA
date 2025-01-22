import java.util.*;

public class NHashingUsingHashMap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = { 1, 2, 1, 2, 3, 4, 3, 2, 1, 3, 4, 1, 2, 3, 3, 2, 2, 99 };

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      System.out.println(e.getKey() + " -> " + e.getValue());
    }
    Set<Integer> keys = map.keySet();
    for (Integer key : keys) {
      System.out.println(key + " -> " + map.get(key));
    }
  }
}
