import java.util.ArrayList;
import java.util.Collections;

public class MinElement {
  public static void main(String[] args) {
    ArrayList<Integer> ele = new ArrayList();
    ele.add(-100);
    ele.add(2);
    ele.add(3);
    ele.add(4);

    int element = Collections.min(ele);
    System.out.println(element);
  }
}
