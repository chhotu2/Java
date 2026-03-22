public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Regular and Premium User service..........!");
    PremiumUser p1 = new PremiumUser("Abhishek");
    p1.displayUserType();
    p1.pay(100);
    p1.refund(10);
    RegularUser p2 = new RegularUser("Anand");
    p2.displayUserType();
    p2.pay(100);
  }
}
