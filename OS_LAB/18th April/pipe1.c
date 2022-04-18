#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pipefds[2];
    char msgw[10];
    char msgr[10];
    int ret = pipe(pipefds);
    if (ret == -1)
    {
        printf("Unable to create pipe");
        return 1;
    }
    if (fork() == 0)
    {
        // child
        read(pipefds[0], msgr, sizeof(msgr));
        printf("\nRead message from pipe: %s\n", msgr);
    }
    else
    { // parent process

        printf("\nEnter message to write into pipe: ");
        scanf("%s", msgw);
        write(pipefds[1], msgw, sizeof(msgw));
        sleep(2);
    }

    return 0;
}