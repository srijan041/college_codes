#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{

    printf("\nPid = %d", getpid());
    if (fork() == 0)
    {
        //sleep(2);
        printf("\nPid = %d,   PPID = %d", getpid(), getppid());
        if (fork() == 0)
        {
            //sleep(2);
            printf("\nPid = %d,   PPID = %d", getpid(), getppid());
        }
    }

    return 0;
}