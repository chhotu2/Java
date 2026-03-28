import java.util.HashMap;
import java.util.Scanner;

public class DublicateElement {
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
    System.out.println(mpp);
    for (HashMap.Entry<Character, Integer> ele : mpp.entrySet()) {
      if (ele.getValue() > 1) {
        System.out.println("Non Repeating Character are: " + ele.getKey() + " and it frequency is : "+ele.getValue());
      }
    }
  }
}
