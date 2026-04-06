import java.util.Scanner;

public class PailndromeNumber {
  public static boolean isPaildromeNumber(int n) {
    boolean res = false;
    int orgNumber = n;
    int result = 0;
    while (n > 0) {
      int digit = n % 10;
      result = result * 10 + digit;
      n = n / 10;
    }
    if (result == orgNumber) {
      res = true;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    System.out.println(isPaildromeNumber(n));
  }
}
