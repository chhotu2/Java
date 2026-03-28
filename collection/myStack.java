import java.util.Scanner;
import java.util.Stack;

public class myStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int ele = sc.nextInt();
      stack.push(ele);
    }
    System.out.println("Befor Removal of Element...........!");
    System.out.println(stack);
    System.out.println("After removal of Element from the Stack...........!");
    stack.pop();
    stack.pop();
    System.out.println(stack);
    System.out.println("Peak Element..... " + stack.peek());
    System.out.println("Is found..........!"+stack.capacity());
  }
}
