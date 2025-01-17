
public class Problem06 {
  public void reverseArray(int arr[]) {
    int left = 0;
    int right = arr.length - 1;
    reverse(left, right, arr);
  }

  static void reverse(int left, int right, int arr[]) {
    if (left >= right) {
      return;
    }
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverse(left + 1, right - 1, arr);
  }
}
