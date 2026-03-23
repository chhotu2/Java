import java.util.ArrayList;
import java.util.*;

class Array_List {
  public static void main(String[] args) {
    ArrayList<Integer> a1 = new ArrayList();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int ele = sc.nextInt();
      a1.add(ele);
    }
    for (int i = 0; i < a1.size(); i++) {
      System.out.print(a1.get(i) + " ");
    }
    System.out.println();
    System.out.println(a1);

    // Find element
    boolean isFound = a1.contains(5);
    System.out.println(isFound);

    // Get index of a element
    int index = a1.indexOf(5);

    // Remove element from the list
    a1.remove(index);

    
    for (Integer element : a1) {
      System.out.print(element);
    }
    System.out.println();

    //Iterator
    Iterator<Integer> it = a1.iterator();
    while(it.hasNext()){
      Integer ele = it.next();
      System.out.print(ele + " ");
    }
    System.out.println(a1);
  }
}