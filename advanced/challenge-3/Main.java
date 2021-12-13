import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // make a new scanner

    // in java you have to use an ArrayList because they are resizeable, unlike
    // arrays. ArrayList behaves exactly like lists in Python
    ArrayList<String> nums = new ArrayList<String>();
    String prevDirection = "";

    while (true) {
      String inp = scanner.nextLine();
      if (inp.equals("99999"))
        break;
      else
        nums.add(inp); // add the input to the list
    }

    for (String num : nums) {
      int directionSum = Character.getNumericValue(num.charAt(0)) +
                         Character.getNumericValue(num.charAt(1));
      String code = num.substring(2);

      if (!(directionSum == 0))
        prevDirection = directionSum % 2 == 0 ? "right" : "left";

      System.out.println(prevDirection + " " + code);
    }

    scanner.close();
  }
}
