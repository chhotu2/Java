import java.util.Scanner;

class CheckSorted {

  public static boolean checkSortedFromLeft(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkSortedFromRight(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        return false;
      }
    }
    return true;
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

    System.out.println(checkSortedFromLeft(arr));
    System.out.println(checkSortedFromRight(arr));
  }
}