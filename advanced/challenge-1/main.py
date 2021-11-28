# Solution to Coding Challenge 1
# Problem: CCC 2019 J1

# Multiple ways to do this one. Below is one of them:

aScore, bScore = 0, 0

for i in range(3):
    aScore += (3 - i) * int(input())

for i in range(3):
    bScore += (3 - i) * int(input())

if aScore > bScore:
    print('A')
elif aScore < bScore:
    print('B')
else:
    print('T')
