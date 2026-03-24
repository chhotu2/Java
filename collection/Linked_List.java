
import java.util.*;
public class Linked_List {
  public static void main(String[] args) {
    LinkedList<Integer>list= new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);

    //Adding at head
    list.add(0, 100);
    System.out.println(list);

    //Adding at mid
    int n = list.size();
    list.add(n/2, 200);
    System.out.println(list);

    //Add element at end position
    n = list.size();
    list.addLast(800);
    System.out.println(list);

    //Remove element from list at specific position
    list.remove(5);
    System.out.println(list);

    //Reverse a Link list
    Collections.reverse(list);
    System.out.println(list);
 
    //Use ArrayList for fast access and LinkedList for frequent insertions/deletions.
  }
}
