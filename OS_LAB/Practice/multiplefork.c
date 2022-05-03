#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <errno.h>

int main()
{
    int id1 = fork();
    int id2 = fork();

    if (id1 == 0)
    {
        if (id2 == 0)
        {
            printf("We are process Y\n");
        }
        else
        {
            printf("We are process X\n");
        }
    }
    else
    {
        if (id2 == 0)
        {
            printf("We are process Z\n");
        }
        else
        {
            printf("We are process Parent\n");
        }
    }

    while (wait(NULL) != -1 || errno != ECHILD)
    {
        printf("Waited for a child to finish\n");
    }

    return 0;
}