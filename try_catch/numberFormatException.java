package try_catch;

import java.util.Scanner;

public class numberFormatException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      String ele = sc.nextLine();
      int conInt = Integer.parseInt(ele);
      System.out.println("Element :-> "+conInt);
    }catch(Exception e){
      e.printStackTrace();
      System.out.println(e.getMessage());
    } 
  }
}
