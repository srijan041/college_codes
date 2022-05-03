#include <stdio.h>
#include <unistd.h>

int main()
{

    int id = fork();

    wait();

    if (id == 0)
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 1)
                printf("I = %d  ", i);
        }
        printf("\n");
    }
    else
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
                printf("I = %d  ", i);
        }
    }
}