import java.util.Scanner;

public class GcdOfNumber {
  public static int gcd(int n1, int n2) {
    Integer res = 0;
    if (n1 >= n2) {
      for (int i = 1; i <= n2; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
          res = Math.max(res, i);
          // res = i;
        }
      }
    } else {
      for (int i = 1; i <= n1; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
          res = Math.max(res, i);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second Number: ");
    int n2 = sc.nextInt();
    System.out.println(gcd(n1, n2));
  }
}
