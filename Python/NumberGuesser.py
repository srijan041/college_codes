import random

print('Guess a number between 1 and 100\n')
low = 1
high = 100

while True:
    r = random.randint(low, high)
    print('Is your number ' , r , ' ?\n')
    i = int(input('Press 1 if correct.\nPress 2 if your number is higher.\nPress 3 if your number is lower.'))

    if(i == 1):
        print('Thanks for playing')
        exit()
    elif(i == 2):
        low = r
    elif(i == 3):
        high = r
    else:
        print('Exiting')
