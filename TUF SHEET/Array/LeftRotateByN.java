import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotateByN {

  public static void leftRotateFunction(List<Integer> arr, int k) {
   // //List<Integer> ans = new ArrayList<Integer>(Collections.nCopies(n,0));
   int n = arr.size();
   int[]ans=new int[n];
    System.out.println("Size" + n);
    for (int i = 0; i < n; i++) {
      // arr.add(i, arr.get((i + k) % arr.size()));
      int index = (i-k+n) % n;
      int element = arr.get(i);
     // System.out.println("index: " + index);
      // ans.add((n - i - k) % n, arr.get(i));
      ans[index]=element;

    }
    System.out.println(ans);
    // return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<Integer>();
    // int[] newArray;
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println(arr);
    leftRotateFunction(arr, 1);
    System.out.println(arr);
  }
}
