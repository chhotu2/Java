import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HigestOccuring {
  public static String HighestFrequency(ArrayList<Integer> arr) {
    int result = -1;
    int count = 0;
    Map<Integer, Integer> mpp = new HashMap<>();
    for (Integer ele : arr) {
      if (mpp.containsKey(ele)) {
        mpp.put(ele, mpp.get(ele) + 1);
      } else {
        mpp.put(ele, 1);
      }
    }
    System.out.println(mpp);

    for (int i = 0; i < arr.size(); i++) {
      if (count < mpp.get(arr.get(i))) {
        count = mpp.get(arr.get(i));
        result = arr.get(i);
      }
    }

    return result + "-> " + count;
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

    System.out.println(HighestFrequency(arr));
  }
}
