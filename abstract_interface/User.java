abstract class User implements PaymentMethod {
  String name;

  abstract void displayUserType();

  public User(String name) {
    this.name = name;
  }
}
