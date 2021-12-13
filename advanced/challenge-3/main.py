# Solution to Coding Challenge 3
# Problem: CCC 2021 J3

# As usual, multiple ways to do this one. Below is one of them:

# Given the nature of these problems, we want to handle input and output
# separately

nums = []  # a list to hold the numbers we're working with
prevDirection = ""  # an empty string to handle the "previous direction" case

# TAKING INPUT

# forever (at least until we break)
while True:
    inp = input()  # take input

    if inp == "99999":  # if the input is 99999, we stop
        break  # stop the forever loop
    else:  # if it's not the 99999
        nums.append(inp)  # add the number to the list of numbers to process

# iterate through each num in the list
for num in nums:
    # calculate the sum of the first two digits in the string to see if it's right, left, or the previous direction
    directionSum = int(num[0]) + int(num[1])
    # grab the code to print by taking the last three digits of the string
    code = num[2:]

    # THIS PART IS OPTIMIZED, you can just do it with good ol' if statements if you want
    # If you need help understanding this, ASK FOR HELP.

    # You could just do this:

    # if directionSum == 0:  # if the direction sum is zero, i.e. if the direction was 00
        # # print the previous direction and the code
        # print(prevDirection, code)
    # elif directionSum % 2 == 0:  # else if the direction is even
        # print("right", code)  # print right and the code
        # prevDirection = "right"  # update the prevDirection to right
    # else:  # if the direction is odd
        # print("left", code)  # print left and the code
        # prevDirection = "left"  # update the prevDirection to left

    # However, the solution below does it a bit differently. This one determines
    # the previous direction BEFOREHAND and then simply does one print statement
    # Essentially, if the directionSum is 0, we LEAVE THE prevDirection ALONE then print it.
    # Else we update it to what it's supposed to be and then print it.

    # if the direction sum we calculated is NOT 00 (previous direction)
    if not directionSum == 0:
        # Here you could just do:

        # if directionSum % 2 == 0:
            # prevDirection = "right"
        # else:
            # prevDirection = "left"

        # BUT you can also do it with the TERNARY OPERATOR (read it like English and it will make sense)
        prevDirection = "right" if directionSum % 2 == 0 else "left"

    print(prevDirection, code)
