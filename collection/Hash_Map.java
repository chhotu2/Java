import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {
  public static void main(String[] args) {
    HashMap<Integer, Integer> mpp = new HashMap();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int ele = sc.nextInt();
      if (mpp.containsKey(ele)) {
        mpp.put(ele, mpp.get(ele) + 1);
      } else {
        mpp.put(ele, 1);
      }
    }

    System.out.println(mpp);
  }
}
