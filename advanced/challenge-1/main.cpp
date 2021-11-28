// Solution to Coding Challenge 1
// Problem: CCC 2019 J1

// Multiple ways to do this one. Below is one of them:

#include <iostream>

int main(int argc, char *argv[]) {
  int aScore, bScore;

  for (size_t i = 0; i < 3; i++) {
    int points;
    std::cin >> points;
    aScore += (3 - i) * points;
  }

  for (size_t i = 0; i < 3; i++) {
    int points;
    std::cin >> points;
    bScore += (3 - i) * points;
  }

  if (aScore > bScore) {
    std::cout << 'A' << std::endl;
  } else if (aScore < bScore) {
    std::cout << 'B' << std::endl;
  } else {
    std::cout << 'T' << std::endl;
  }

  return 0;
}
