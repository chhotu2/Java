import java.util.Scanner;


public class ArmStrong {

  public static int countDigit(int n){
    int count=0;
    while(n>0){
      count++;
      n=n/10;
    }
    return count;
  }

  public static boolean isArmStrong(int n){
    int orgNumber = n;
    double m = countDigit(orgNumber);
    //System.out.println(m);
    double res =0;
    while(n>0){
      double digit = n%10;
      res =  res + Math.pow(digit, m);
      n=n/10;
    }
    if(res==orgNumber){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    //System.out.println(2^4);
    System.out.println(isArmStrong(n));
  }
}
