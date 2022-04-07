


def add(x, y):
    return x + y
    
def subtract(x, y):
    return x - y 

def multiply(x, y):
    return x * y

def divide(x, y):
    return x/y

def power(x, y):
    return pow(x, y)

def modulus(x, y):
    return x % y


print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
print("5.Power")
print("6.Modulus")

while True:
    try:
        choice = int(input('Enter choice (1-6): '))
    except:
        print('Thanks for using')
        exit()



    if choice in range(1, 7):
        num1 = float(input('Enter first number: '))
        num2 = float(input('Ente second number: '))

        if choice == 1:
            print(num1, "+", num2, "=", add(num1, num2))
        
        elif choice == 2:
            print(num1, "-", num2, "=", subtract(num1, num2))
        
        elif choice == 3:
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif choice == 4:
            print(num1, "/", num2, "=", divide(num1, num2))

        elif choice == 5:
            print(num1, "^", num2, "=", power(num1, num2))
            
        elif choice == 6:
            print(num1, "%", num2, "=", modulus(num1, num2))

    
    else:
        print('Invalid Choice')


    
