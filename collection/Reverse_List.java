import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse_List {
  public static void main(String[] args) {
    ArrayList<Integer> ele = new ArrayList();
    ele.add(1);
    ele.add(2);
    ele.add(3);
    ele.add(4);
    System.out.println(ele);
    Collections.reverse(ele);
    System.out.println(ele);
  }
}
