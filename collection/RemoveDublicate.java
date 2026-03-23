import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
  public static void main(String[] args) {
    ArrayList<Integer> ele = new ArrayList();
    ele.add(-100);
    ele.add(2);
    ele.add(3);
    ele.add(4);
    ele.add(2);
    ele.add(3);
    System.out.println(ele);
    Set<Integer> s = new HashSet<>();

    for (int i = 0; i < ele.size(); i++) {
      s.add(ele.get(i));
    }
    System.out.println(s);
  }
}
