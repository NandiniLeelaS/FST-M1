# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declaring the final list that contains the combination of odd from fist list and even from second list
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if num % 2 != 0:
        thirdList.append(num)

# Iterate through first list to get even elements
for num in listTwo:
    if num % 2 == 0:
        thirdList.append(num)

# Print result
print("result List is:")
print(thirdList)
