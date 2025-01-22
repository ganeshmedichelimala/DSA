
import java.util.*;

public class HashmapA {
  public static void main(String[] args) {
    // country(key), population(value)
    HashMap<String, Integer> map = new HashMap<>();

    // Insertion
    map.put("India", 120);
    map.put("US", 30);
    map.put("China", 150);

    System.out.println(map);
    map.put("China", 180);
    System.out.println(map);

    // search
    // if (map.containsKey("China")) {
    // System.out.println("Key is present");
    // } else {
    // System.out.println("Key is not present");

    // }
    // System.out.println(map.get("China")); // exist
    // System.out.println(map.get("isahdf")); // exist

    // iteration
    // for(iterator : collecttion)
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }

    // using set
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " " + map.get(key));
    }

    // removing an element
    map.remove("China");
  }

}