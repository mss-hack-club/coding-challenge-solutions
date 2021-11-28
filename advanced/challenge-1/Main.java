import java.util.Scanner;

// Solution to Coding Challenge 1
// Problem: CCC 2019 J1

// Multiple ways to do this one. Below is one of them:

public class Main {
  public static void main(String[] args) {
    int aScore = 0, bScore = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      aScore += (3 - i) * scanner.nextInt();
    }

    for (int i = 0; i < 3; i++) {
      bScore += (3 - i) * scanner.nextInt();
    }

    if (aScore > bScore) {
      System.out.println('A');
    } else if (aScore < bScore) {
      System.out.println('B');
    } else {
      System.out.println('T');
    }

    scanner.close();
  }
}
