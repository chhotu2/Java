import java.util.Scanner;

public class CountDigit {
  public static int countDigit(int n) {
    int count = 0;
    int m = n;
    while (m > 0) {
      count++;
      
      m = m / 10;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    System.out.println(countDigit(n));
  }
}
