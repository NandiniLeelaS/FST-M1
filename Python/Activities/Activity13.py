def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum


numberList = [10, 40, 60, 90]

result = calculate_sum(numberList)

print("The sum of all the numbers : " + str(result))
