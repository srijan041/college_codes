import random

def rollDice():
    return random.randint(1,6)

while True:
    choice = int(input('\nPress 1 to play.\nPress 2 to exit.\nChoice: '))
    if choice == 1:
        print(rollDice())
    else:
        print('Thanks for playing')
        exit()