#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{

    int sumOdd = 0;
    int sumEven = 0;

    int n = fork();
    if (n > 0)
    {
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
                sumEven += i;
        }

        printf("Parent process. %d\n", getpid());
        printf("Sum of even number = %d\n", sumEven);
    }
    else
    {
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 1)
                sumOdd += i;
        }

        printf("Child process. %d\n", getpid());
        printf("Sum of odd number = %d\n", sumOdd);
    }
}