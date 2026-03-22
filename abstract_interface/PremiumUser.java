public class PremiumUser extends User implements Refundable {
  public PremiumUser(String name) {
    super(name);
    // TODO Auto-generated constructor stub
  }

  public void refund(double amount){
    System.out.println("Special feature ....you can apply for refund and this is for the Priumium users only.....!");
  }

  public void displayUserType() {
    System.out.println("You are a Premium User");
  }

  public void pay(double amt) {
    double res = amt - (0.1 * amt);
    System.out.println("Hello " + name
        + " as you are a  premium user then you will get 10% extra discount and you will have to pay: " + res);
  }
}
