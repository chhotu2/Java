import java.util.Scanner;

public class SquarePattern {

  public static void printPattern(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the pattern: ");
    int n =sc.nextInt();
    printPattern(n);
  }
}
