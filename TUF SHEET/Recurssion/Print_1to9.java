import java.util.Scanner;

public class Print_1to9 {
  public static void printOneToNine(int n) {
    if (n == 0) {
      return;
    }
    printOneToNine(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printOneToNine(n);
  }
}
