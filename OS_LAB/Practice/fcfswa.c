#include <stdio.h>
#include <unistd.h>

struct process
{
    int id;
    int AT;
    int BT;
    int CT;
    int TAT;
};

void swap(struct process *x, struct process *y)
{
    struct process temp = *x;
    *x = *y;
    *y = temp;
}

struct process P[5];
// struct process gantt[5];

void userInput()
{
    for (int i = 0; i < 5; i++)
    {
        P[i].id = i;
        printf("\nEnter the arrival time & burst time of process %d:", i + 1);
        scanf("%d%d", &P[i].AT, &P[i].BT);
    }
}

void displayTable()
{
    printf("\nPID\tAT\tBT\tCT\tTAT");
    for (int i = 0; i < 5; i++)
    {
        printf("\n%d\t%d\t%d\t%d\t%d", P[i].id, P[i].AT, P[i].BT, P[i].CT, P[i].TAT);
    }
}

void fillGantt()
{
    for (int i = 0; i < 5 - 1; i++)
    { // sorted according to AT
        for (int j = i; j < 5 - i - 1; j++)
        {
            if (P[j].AT > P[j + 1].AT)
            {
                swap(&P[j], &P[j + 1]);
            }
        }
    }

    int time = 0;
    int isEnd = 0;
    P[0].CT = P[0].BT;
    P[0].TAT = P[0].CT - P[0].AT;

    for (int i = 1; i < 5; i++)
    {
        P[i].CT = P[i].BT + P[i - 1].CT; // CT
        P[i].TAT = P[i].CT - P[i].AT;
    }
}

int main()
{
    userInput();
    fillGantt();
    displayTable(&P);

    return 0;
}