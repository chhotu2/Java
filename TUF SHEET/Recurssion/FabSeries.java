import java.util.Scanner;
public class FabSeries {
  public static int printFabSeries(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return printFabSeries(n - 1) + printFabSeries(n - 2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ente the Number : ");
    int n = sc.nextInt();
    System.out.println(printFabSeries(n));
  }
}
