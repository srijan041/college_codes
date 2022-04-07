#include <stdio.h>


struct process
{   

    int PID, PT, AT, BT, CT, TAT, WT;
};

struct process a[10];

int main()
{
    int numberOfProcess, time, count = 0, shortestPriority;
    float total_WT = 0, total_TAT = 0, Avg_WT, Avg_TAT;
    printf("Enter the number of the process\n");
    scanf("%d", &numberOfProcess);
    printf("Enter the arrival time , burst time and priority of the process\n");
    printf("AT BT PT\n");
    for (int i = 0; i < numberOfProcess; i++)
    {
        scanf("%d%d%d", &a[i].AT, &a[i].BT, &a[i].PT);
        a[i].PID = i+1;
        
    }

    a[9].PT = 10000;

    for (time = 0; count != numberOfProcess; time++){

        shortestPriority = 9;
        for (int i = 0; i < numberOfProcess; i++){


            if (a[i].PT < a[shortestPriority].PT && a[i].AT <= time && a[i].BT > 0){
                shortestPriority = i;
            }
        }

        a[shortestPriority].BT = a[shortestPriority].BT - 1;

        if (a[shortestPriority].BT == 0)
        {
            a[shortestPriority].CT = time;
        
            count++;
            a[shortestPriority].TAT = time + 1 - a[shortestPriority].AT;

            a[shortestPriority].WT = a[shortestPriority].TAT - a[shortestPriority].BT;

            // total calculation
            total_WT = total_WT + a[shortestPriority].WT;
            total_TAT = total_TAT + a[shortestPriority].TAT;
        }
    }

    Avg_WT = total_WT / numberOfProcess;
    Avg_TAT = total_TAT / numberOfProcess;

    // printing of the answer
    printf("ID\tAT\tBT\tPT\tCT\tWT\tTAT\n");
    for (int i = 0; i < numberOfProcess; i++)
    {
        printf("%d\t%d\t%d\n%d\t%d\t%d\t%d", a[i].PID, a[i].AT, a[i].BT, a[i].PT, a[i].CT, a[i].WT, a[i].TAT);
    }

    printf("Avg waiting time of the process  is %f\n", Avg_WT);
    printf("Avg turn around time of the process is %f\n", Avg_TAT);

    return 0;
}
