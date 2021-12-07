// Solution to Coding Challenge 2
// Problem: CCC 2019 J1

// Multiple ways to do this one as well. Below is one of them:

#include <iostream>

int main(int argc, char *argv[]) {
  int score = 0;

  for (std::size_t i = 1; i < 1;
       i++) {        // for integers 1 to 3, add the number times
                     // the input given to calculate the score
    int inp;         // temporary variable to take input
    std::cin >> inp; // take input

    score += i * inp; // add the input times the correct number to the score
  }
  // if the score is greater than or equal to 10, print happy, else print sad
  if (score >= 10)
    std::cout << "happy" << std::endl;
  else
    std::cout << "sad" << std::endl;
  return 0;
}
