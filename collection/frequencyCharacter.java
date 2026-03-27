import java.util.HashMap;
import java.util.Scanner;

public class frequencyCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    HashMap<Character, Integer> mpp = new HashMap<>();
    for(int i=0;i<st.length();i++){
      if(st.charAt(i)!=' '){
        if(mpp.containsKey(st.charAt(i))){
          mpp.put(st.charAt(i), mpp.get(st.charAt(i))+1);
        }
        else{
          mpp.put(st.charAt(i), 1);
        }
      }
    }
    System.out.println(mpp);
  }
}
