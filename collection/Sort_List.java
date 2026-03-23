import java.util.ArrayList;
import java.util.Collections;

public class Sort_List {
  public static void main(String[] args) {
    ArrayList<Integer> ele = new ArrayList();
    ele.add(-100);
    ele.add(21);
    ele.add(3);
    ele.add(14);

    System.out.println(ele);
    Collections.sort(ele);
    System.out.println(ele);

    Collections.sort(ele, Collections.reverseOrder());
    System.out.println(ele);
  }
}
