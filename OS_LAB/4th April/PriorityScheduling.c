#include <stdio.h>
struct process
{
    int ID, CT, WT, AT, BT, TAT, PT;
};

struct process a[10];

int main()
{
    int numberOfProcess, temp[10], time, count = 0, shortestPriority;
    float total_WT = 0, total_TAT = 0, Avg_WT, Avg_TAT;
    printf("Enter the number of the process\n");
    scanf("%d", &numberOfProcess);
    printf("Enter the arrival time , burst time and priority of the process\n");

    printf("AT BT PT\n");
    for (int i = 0; i < numberOfProcess; i++)
    {
        scanf("%d%d%d", &a[i].AT, &a[i].BT, &a[i].PT);

        temp[i] = a[i].BT;
        a[i].ID = i;
    }

    a[9].PT = 10000;

    for (time = 0; count != numberOfProcess; time++)
    {
        shortestPriority = 9;
        for (int i = 0; i < numberOfProcess; i++)
        {
            if (a[shortestPriority].PT > a[i].PT && a[i].AT <= time && a[i].BT > 0)
            {
                shortestPriority = i;
            }
        }

        a[shortestPriority].BT = a[shortestPriority].BT - 1;

        if (a[shortestPriority].BT == 0)
        {

            count++;
            a[shortestPriority].CT = time + 1;
            a[shortestPriority].TAT = time + 1 - a[shortestPriority].AT;

            a[shortestPriority].WT = time + 1 - a[shortestPriority].AT - temp[shortestPriority];

            total_WT = total_WT + a[shortestPriority].WT;
            total_TAT = total_TAT + a[shortestPriority].TAT;
        }
    }

    Avg_WT = total_WT / numberOfProcess;
    Avg_TAT = total_TAT / numberOfProcess;

    printf("ID WT TAT\n");
    for (int i = 0; i < numberOfProcess; i++)
    {
        printf("%d %d\t%d\n", a[i].ID + 1, a[i].WT, a[i].TAT);
    }

    printf("\nAvg waiting time of the process  is %f\n", Avg_WT);
    printf("\nAvg turn around time of the process is %f\n", Avg_TAT);

    return 0;
}