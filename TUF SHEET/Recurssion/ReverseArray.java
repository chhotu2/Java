import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
  public static void reverseArray(ArrayList<Integer> arr) {
    int i = 0;
    int j = arr.size() - 1;
    while (i < j) {
      int temp = arr.get(i);
      // arr.add(i)=arr.get(j);
      // arr.add(j)=temp;
      arr.set(i, arr.get(j));
      arr.set(j, temp);
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println(arr);
    reverseArray(arr);
    System.out.println(arr);
  }
}
