import java.util.Scanner;

public class Print_nto1 {

  public static void printNTimes(int n){
    if(n==0){
      return;
    }
    System.out.print(n + " ");
    printNTimes(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printNTimes(n);
  }
}
