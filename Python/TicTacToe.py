


rows, cols = (3, 3)
arr = [['_' for i in range(cols)] for j in range(rows)]




def isWin():
    win = False
    pDiagonal = ''
    sDiagonal = ''
    for i in range(rows):
        colValue = ''
        
        for j in range(cols):
            colValue += arr[j][i] #for having vertical match



            if(i == j):
                pDiagonal += arr[i][j] #for primary diagonal


            if((i+j) == rows-1):
                sDiagonal += arr[i][j] #for secondary diagonal

            
            if(''.join(arr[i]) == 'XXX' or ''.join(arr[i]) == 'OOO' or colValue == 'XXX' or colValue == 'OOO' or 
                pDiagonal == 'XXX' or pDiagonal == 'OOO' or sDiagonal == 'XXX' or sDiagonal == 'OOO'):
                return True
            
    return False




def gamePlay():
    attempts = int(0)
    inputSymbol = ''
    while (attempts in range(9)):
        print('Attempt = ', attempts)

        if(attempts % 2 == 0):
            inputSymbol = 'X'
        else:
            inputSymbol = 'O'

        printArray()
        print(
'''
00      01      02
10      11      12
20      21      22
''')

        inputText = 'Enter the location of '+ inputSymbol+ ' : '
        try:
            address = int(input(inputText))
            ith = int(address/10)
            jth = int(address%10)

            if(address < 00 or address > 22):
                raise Exception('Wrong Input')
        except:
            print('Wrong Input')
            continue


        

        if(arr[ith][jth] != '_'):
            print('Element already present at index')
            continue
        else:
            arr[ith][jth] = inputSymbol

            if(isWin()):
                printArray()
                print('Congratulation \'' +  inputSymbol + '\' on winning!')
                return

        attempts += 1
    
    else:
        printArray()
        print('Draw.')

        

    


def printArray():
    print('\n')
    for i in range(rows):
        for j in range(cols):
            print(arr[i][j], end = '\t')
        print('\n')

gamePlay()
