package try_catch;

import java.util.Scanner;

public class divideByZero {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 0;

    try {
      int result = a / b;
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("Entering in exception Part");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
