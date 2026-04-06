import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisor {
  public static ArrayList<Integer> printDivisor(int n) {
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        arr.add(i);
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    ArrayList<Integer> ans = printDivisor(n);
    System.out.println(ans);

  }
}
