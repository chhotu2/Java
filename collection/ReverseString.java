import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(st);
    for (int i = 0; i < st.length(); i++) {
      stack.add(st.charAt(i));
    }
    System.out.println(stack);
    int i = 0;
    String newString = "";
    String temp = "";
    System.out.println(stack.size());
    int n = stack.size();
    while (!stack.empty()) {
      if (stack.peek() != ' ') {
        temp = temp + stack.peek();
        stack.pop();
        // i++;
      } else {
        newString = temp + " " + newString;
        temp = " ";
        stack.pop();
        // i++;
      }

    }
    newString = temp + " " + newString;
    System.out.println("Stack size : " + stack.size());
    System.out.println(newString);
  }
}
