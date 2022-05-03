#include <stdio.h>

#define size 4

struct process
{
    int id;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
};

void swap(struct process *x, struct process *y)
{
    struct process temp = *x;
    *x = *y;
    *y = temp;
}

struct process P[size];

void userInput()
{
    for (int i = 0; i < size; i++)
    {
        P[i].id = i;
        printf("Enter arrival time and burst time of process %d: ", i + 1);
        scanf("%d%d", &P[i].at, &P[i].bt);
    }
}

void displayTable(struct process *temp)
{
    printf("\nPID\tAT\tBT\tCT\tTAT\tWT");

    for (int i = 0; i < size; i++)
    {
        printf("\n%d\t%d\t%d\t%d\t%d\t%d", temp[i].id+1, temp[i].at, temp[i].bt, temp[i].ct, temp[i].tat, temp[i].wt);
    }
}

void sortAT(struct process *temp)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i; j < size - i - 1; j++)
        {
            if (temp[j].at > temp[j + 1].at)
            {
                swap(&temp[j], &temp[j + 1]);
            }
        }
    }
}

void sortBT(struct process *temp, int beg, int last)
{
    for (int i = beg; i < last - 1; i++)
    {
        for (int j = i; j < last - i - 1; j++)
        {
            if (temp[j].bt > temp[j + 1].bt)
            {
                swap(&temp[j], &temp[j + 1]);
            }
        }
    }
}

void fillGantt()
{
    int time = 0;
    sortAT(P);

    struct process ready[20];
    struct process gantt[20];
    for (int j = 0; j < 20; j++)
    {
        ready[j].at = gantt[j].at = 9999;
    }

    int current = 0;
    int top = 0;
    int end = 0;
    int isEnd = 1; // 0 = end, 1 = not end

    // ready[end++] = P[0];

    int i = 0;

    printf("before while\n");

    while (!((i == size) && (top == end)))
    {
        // printf("inside while\n");

        // if((i == size - 1) && (top == end))
        // {
        //     isEnd = 0;
        //     break;
        // }

        while (i < size)
        {
            printf("Inside for, I = %d\n", i);
            if (P[i].at <= time)
            {
                ready[end++] = P[i];
                i++;
            }
            else
            {
                break;
            }
        }
        // printf("\nTop = %d, End = %d", top, end);

        // printf("inside while\n");

        if (ready[top].at <= time)
        {
            // printf("inside if\n");
            sortBT(ready, top, end);
            gantt[current] = ready[top++];
            time += gantt[current].bt;
            gantt[current].ct = time;
            gantt[current].tat = gantt[current].ct - gantt[current].at;
            gantt[current].wt = gantt[current].tat - gantt[current].bt;
            current++;
        }
        else
        {
            time++;
        }
    }

    displayTable(gantt);
}

int main()
{
    userInput();
    fillGantt();
    // displayTable(P);

    return 0;
}