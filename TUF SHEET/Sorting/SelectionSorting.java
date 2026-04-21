import java.util.Scanner;

public class SelectionSorting {
  public static int[] sortArray(int[] arr) {
    int n = arr.length;
    int[] newArray = new int[n];
    for (int i = 0; i < n; i++) {
      int ele = Integer.MAX_VALUE;
      int minIndex = -1;
      for (int j = 0; j < n; j++) {
        if (arr[j] < ele) {
          ele = arr[j];
          minIndex = j;
        }
      }
      newArray[i] = ele;
      ele = Integer.MAX_VALUE;
      arr[minIndex] = Integer.MAX_VALUE;
    }

    return newArray;
  }

  public static void selectionSortArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int index = i;
      int ele = Integer.MAX_VALUE;
      for (int j = i; j < arr.length; j++) {
        if (arr[index] > arr[j]) {
          // ele = arr[j];
          index = j;
        }
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
      index = -1;
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
    // newArray = sortArray(arr);
    // for (int ele : newArray) {
    // System.out.print(ele + " ");
    // }
    selectionSortArray(arr);
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
  }
}
