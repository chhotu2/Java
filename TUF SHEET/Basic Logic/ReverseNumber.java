import java.util.Scanner;

public class ReverseNumber {
  public static int reverseNumber(int n) {
    int result = 0;
    //n >= 0 0 → 0 → 0 → 0 → infinite loop 😵 When m becomes 0, the loop never stops ❌
    while (n > 0) {
      int digit = n % 10;
      result = result * 10 + digit;
      n = n / 10;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    System.out.println(reverseNumber(n));
  }
}
