#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>

int main()
{
    printf("Parent : \nprocess P[1]\t PID = %d\n", getpid());
    printf("------------------------------------------------\n");
    printf("Child : \n");
    for (int i = 0; i < 3; i++)
    {
        if (fork() == 0)
        {
            printf("Process P[%d]\t PID = %d\t PPID = %d\n", i + 2, getpid(),
                   getppid());
            return 0;
        }
    }
    return 0;
}
