import java.util.Scanner;

public class Print_ntimes {

  public static void printNTimes(int n) {
    int i = 0;
    if (i == n) {
      return;
    }
    System.out.println("Abhishek Anand");
    printNTimes(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printNTimes(n);
  }
}
