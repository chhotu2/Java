import java.util.Scanner;

public class Sum_nNumber {
  public static int sum(int n) {
    int res = 0;
    if (n == 0) {
      return 0;
    }
    res = res + n + sum(n - 1);
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sum(n));
  }
}
