#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{
    int n = 10;
    if ((fork() == 0))
    {
        printf("Child process: ");
        printf("%d\n", ++n);
    }
    else
    {
        printf("Parent process: ");
        printf("%d\n", --n);
    }
}