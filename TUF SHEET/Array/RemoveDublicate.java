import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDublicate {

  public static List<Integer> RemoveDublicate(List<Integer> arr) {
    HashSet<Integer> st = new HashSet<>();
    for (int i = 0; i < arr.size(); i++) {
      st.add(arr.get(i));
    }
    arr.clear();
    for (Integer ele : st) {
      arr.add(ele);
    }
    return arr;
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
    RemoveDublicate(arr);
    System.out.println(arr);
  }
}
