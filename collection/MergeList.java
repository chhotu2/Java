import java.util.ArrayList;
import java.util.Collections;

public class MergeList {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList();
    list1.add(-100);
    list1.add(2);
    list1.add(3);
    list1.add(4);

    System.out.println(list1);
    ArrayList<Integer> list2 = new ArrayList();
    list2.add(-100);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    System.out.println(list2);

    ArrayList<Integer> list3 = new ArrayList<>();
    for (Integer ele1 : list1) {
      list3.add(ele1);
    }

    for (Integer ele2 : list2) {
      list3.add(ele2);
    }

    Collections.sort(list3);
    System.out.println(list3);
  }
}
