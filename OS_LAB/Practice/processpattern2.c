#include <stdio.h>
#include <unistd.h>

int main()
{
    printf("Parent : \nprocess P[1]\t PID = %d\n", getpid());
    printf("------------------------------------------------\n");
    printf("Child : \n");
    if (fork() == 0)
    {
        printf("Process P[2]\t PID = %d\t PPID = %d\n", getpid(), getppid());
        if (fork() == 0)
        {
            printf("Process P[3]\t PID = %d\t PPID = %d\n", getpid(), getppid());
            if (fork() == 0)
            {
                printf("\nProcess P[4]\t PID = %d\t PPID = %d\n", getpid(),
                       getppid());
                return 0;
            }
        }
    }
    return 0;
}