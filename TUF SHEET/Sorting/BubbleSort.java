import java.util.Scanner;

public class BubbleSort {

  public static void bubbleSortArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
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
    bubbleSortArray(arr);
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
  }
}
