import java.util.ArrayList;

public class SecondLargestElement {

  public static void main(String[] args) {

    ArrayList<Integer> ele = new ArrayList<>();
    ele.add(1);
    ele.add(5);
    ele.add(3);
    ele.add(4);

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : ele) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } 
      else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    System.out.println("Second Largest: " + secondLargest);
  }
}