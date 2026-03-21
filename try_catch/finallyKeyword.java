package try_catch;

import java.util.Scanner;

public class finallyKeyword {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Starting..........");
    int a = sc.nextInt();
    Integer b = null;

    try {
      System.out.println("Output " + a / b);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException Occured");
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundException");
      e.printStackTrace();
    } finally {
      System.out.println("Finally block executed.......");
    }
  }
}