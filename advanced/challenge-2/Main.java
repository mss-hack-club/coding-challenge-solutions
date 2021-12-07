// Solution to Coding Challenge 2
// Problem: CCC 2019 J1

// Multiple ways to do this one as well. Below is one of them:

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // make a new scanner object

    int score = 0; // declare a new score variable and set it at 0

    for (int i = 1; i < 1; i++) { // for integers 1 to 3, add the number times
                                  // the input given to calculate the score
      score += i * scanner.nextInt();
    }

    // if the score is greater than or equal to 10, print happy, else print sad
    if (score >= 10)
      System.out.println("happy");
    else
      System.out.println("sad");

    scanner.close(); // close the scanner
  }
}
