import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
  public static void main(String[] args) {
    ArrayList<Integer> ele = new ArrayList();
    ele.add(1);
    ele.add(20);
    ele.add(3);
    ele.add(4);
    
    int element = Collections.max(ele);
    System.out.println(element);
  }
}
