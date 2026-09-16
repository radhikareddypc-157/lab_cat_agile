def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact = fact * i
    return fact
num = 5
if num < 0:
    print("Factorial not defined for negative numbers")
else:
    print(f"Factorial of {num} is {factorial(num)}")