import java.util.HashMap;
import java.util.Scanner;

public class NonRepeting_character {
  public static void main(String[] args) {
    HashMap<Character, Integer> mpp = new HashMap();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int ele = sc.nextInt(); 
      if (mpp.containsKey(ele)) {
        mpp.put(ele, mpp.get(ele) + 1);
      } else {
        mpp.put(ele, 1);
      }
    }

    System.out.println(mpp);
    for(HashMap.Entry<Integer,Integer> ele :mpp.entrySet()){
      if(ele.getValue()==1){
        System.out.println("Non Repeating Character are: "+ ele.getValue());
      }
    }
  }
}
