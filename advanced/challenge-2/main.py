# Solution to Coding Challenge 2
# Problem: CCC 2019 J1

# Multiple ways to do this one as well. Below is one of them:

score = 0  # declare a new score variable and set it at 0

for i in range(1, 4):  # for integers 1 to 3, add the number times
    # the input given to calculate the score
    score += i * int(input())

# if the score is greater than or equal to 10, print happy, else print sad
if score >= 10:
    print('happy')
else:
    print('sad')
