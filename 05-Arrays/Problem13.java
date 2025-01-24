public class Problem13 {
  public boolean findCount(int n) {
    int count = 0;
    while (n > 0) {
      n /= 10;
      count++;
    }
    if (count % 2 == 0)
      return true;
    else
      return false;
  }

  public int findNumbers(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (findCount(nums[i]))
        count++;
    }
    return count;
  }
}
