import java.util.Scanner;

public class checkPailndrome {
  public static boolean isPailndrome(String st){
    String oldString = st;
    String newString = new StringBuilder(st).reverse().toString();
    if(newString.equals(oldString)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ente the String : ");
    String st = sc.nextLine();
    boolean res = isPailndrome(st);
    if(res==true){
      System.out.println("Paildrome");
    }
    else{
      System.out.println("Not Pailndrome");
    }
  }
}
