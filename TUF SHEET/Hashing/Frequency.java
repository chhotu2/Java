import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

  public static int countFrequency(ArrayList<Integer> arr, int element) {
    int result = 0;
    Map<Integer, Integer> mpp = new HashMap<>();
    for (Integer ele : arr) {
      if (mpp.containsKey(ele)) {
        mpp.put(ele, mpp.get(ele) + 1);
      } else {
        mpp.put(ele, 1);
      }
    }
    System.out.println("Map");
    System.out.println(mpp);
    if (mpp.containsKey(element)) {
      return mpp.get(element);
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println(arr);
    sc.nextLine();
    System.out.print("Enter the element that you want to search : ");
    int element = sc.nextInt();

    System.out.println(countFrequency(arr, element));
  }
}
