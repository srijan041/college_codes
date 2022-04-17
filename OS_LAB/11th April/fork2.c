#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

// fork() -> 0 when if it is child
// fork() -> +ve if it is parent
// fork() -> -ve if unsuccesful child creation

int main()
{
    if (fork() == 0)
        printf("Child process\n");
    else if (fork() < 0)
        printf("Unsuccessful child creation\n");
    else
        printf("Parent process\n");
}