public class RegularUser extends User {
  public RegularUser(String name) {
    super(name);
    // TODO Auto-generated constructor stub
  }

  public void displayUserType() {
    System.out.println("You are a Regular User");
  }

  public void pay(double amt) {
    double res = (0.05 * amt) + amt;
    System.out
        .println("Hello " + name + " as you are a  regular user then you will have to pay 5% extra and you will have to pay:- " + res);
  }
}
