import java.util.ArrayList;

public class Problem08 {
  public int[] createTargetArray(int[] nums, int[] index) {
    int n = nums.length;
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(index[i], nums[i]);
    }
    int i = 0;
    for (Integer e : arr) {
      nums[i] = e;
      i++;
    }
    return nums;
  }
}
