
public class Problem04 {
  public int[] shuffle(int[] nums, int n) {
    int len = nums.length;
    int[] arr = new int[len];
    int j = 0;
    for (int i = 0; i < n; i++) {
      arr[j] = nums[i];
      j++;
      arr[j] = nums[i + n];
      j++;
    }
    return arr;
  }
}
