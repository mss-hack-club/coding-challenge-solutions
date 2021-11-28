import java.util.Scanner; // import scanner class

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // create link to input stream

    System.out.println(
        "Enter the base of your triangle (in meters) :"); // prompt the user to
                                                          // enter a value for
                                                          // the base of the
                                                          // triangle
    double base = input.nextDouble(); // get the user's choice of base

    System.out.println(
        "Enter the height of your triangle (in meters) :"); // prompt the user
                                                            // to enter a value
                                                            // for the height of
                                                            // the triangle
    double height = input.nextDouble(); // get the user's choice of height

    double area = (base * height) /
                  2; // create a variable and store the value of the area of the
                     // triangle using the formula (base x height)/2
    System.out.println("The area of your triangle is " + area +
                       " m^2"); // output the area of the triangle
  }                             // main method bracket
} // Main class method
