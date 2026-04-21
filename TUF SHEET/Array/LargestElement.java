import java.util.Scanner;

public class LargestElement {
  public static int largestElementFunction(int[] arr) {
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      ans = Math.max(ans, arr[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    // int[] newArray;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(largestElementFunction(arr));
  }
}
