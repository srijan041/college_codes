#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

struct process
{
    int id;
    int AT;
    int BT;
    int priority;
    int beg;
    int end;
    int CT;
    int TAT;
    int WT;
};

struct process P[3];

void inputGrantt()
{

    for (int i = 0; i < 3; i++)
    {
        P[i].id = i;
        printf("\nEnter AT and priority for process %d: ", i);
        scanf("%d%d", &P[i].AT, &P[i].priority);
    }

    for (int i = 0; i < 3; i++)
    {
        P[i].BT = 0;
        P[i].beg = 0;
    }
    int isEnd = 0; // 0 = not ended
    do
    {
        printf("\nEnter process id:");
        int pid;
        scanf("%d", &pid);
        printf("\nEnter begining and ending: ");
        int beg, end;
        scanf("%d%d", &beg, &end);
        if (P[pid].beg == 0)
            P[pid].beg = beg;
        P[pid].end = end;
        P[pid].BT += (end - beg);

        int c;
        printf("Is there any more entry? (0/1)");
        scanf("%d", &c);
        if (c == 0)
            isEnd = 1;

    } while (isEnd == 0);
}

void fillTable()
{
    for (int i = 0; i < 3; i++)
    {
        P[i].CT = P[i].end;
        P[i].TAT = P[i].CT - P[i].AT;
        P[i].WT = P[i].TAT - P[i].BT;
    }
}

void display()
{
    printf("\nPID\t AT\t PR\t BT\t CT\t TAT\t WT ");
    for (int i = 0; i < 3; i++)
    {
        printf("\n%d\t %d\t %d\t %d\t %d\t %d\t %d\t",
               P[i].id, P[i].AT, P[i].priority, P[i].BT, P[i].CT, P[i].TAT, P[i].WT);
    }
}

int main()
{
    inputGrantt();
    fillTable();
    display();
    float totalTAT = 0;
    float totalWT = 0;
    for (int i = 0; i < 3; i++)
    {
        totalTAT += P[i].TAT;
        totalWT += P[i].WT;
    }

    printf("\nAVG TAT = %f", totalTAT / 3);
    printf("\nAVG WT = %f", totalWT / 3);

    return 0;
}