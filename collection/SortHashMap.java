import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortHashMap {

  public static void main(String[] args) {
    HashMap<Character, Integer> mpp = new HashMap();
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    String st = sc.nextLine();
    for (int i = 0; i < st.length(); i++) {
      // int ele = sc.nextInt();
      if (st.charAt(i) != ' ') {

        if (mpp.containsKey(st.charAt(i))) {
          mpp.put(st.charAt(i), mpp.get(st.charAt(i)) + 1);
        } else {
          mpp.put(st.charAt(i), 1);
        }
      }
    }
    System.out.println("Printing Map ");
    System.out.println(mpp);
    TreeMap<Character, Integer> treeMap = new TreeMap<>(mpp);
    System.out.println("Printing Sorted ");
    ArrayList<HashMap.Entry<Character,Integer>> list = new ArrayList<>(mpp.entrySet());
    //Important for sorting using lamda function
    Collections.sort(list, (a,b) -> a.getValue() - b.getValue());
    System.out.println("Sorted by Frequency:");
    for (Map.Entry<Character, Integer> entry : list) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    System.out.println(list);
    //System.out.println(treeMap);
    for (HashMap.Entry<Character, Integer> ele : mpp.entrySet()) {
      if (ele.getValue() == 1) {
        System.out.println("Non Repeating Character are: " + ele.getKey());
      }
    }
  }
}