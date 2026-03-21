package try_catch;

import java.util.Scanner;

 

public class outOfBound {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter number at " + (i + 1) + " position");
      int ele = sc.nextInt();
      arr[i] = ele;
    }
    try {
      System.out.println("Eneter the position in which you want to access the element from the array: ");
      int pos = sc.nextInt();
      System.out.println(arr[pos - 1]);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.getStackTrace();
     } /*catch(ArrayIndexOutOfBoundsException e){
    //   e.printStackTrace();
    // }*/

  }
}
