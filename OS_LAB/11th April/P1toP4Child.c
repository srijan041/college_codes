#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{

    printf("%x\n", getpid());

    int n = fork();

    if (n == 0)
    {
        printf("\n%x \t %x", getpid(), getppid());
    }
    else
    {
        int n = fork();
        if (n == 0)
        {
            printf("\n%x \t %x \t", getpid(), getppid());
        }
        else
        {
            int n = fork();
            if (n == 0)
            {
                printf("\n%x \t %x \t", getpid(), getppid());
            }
        }
    }
    return 0;
}