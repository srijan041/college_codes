#include <stdio.h>

struct info
{
    int roll_no;
    char *name[50];
    float CGPA;
};

void display(struct info *i)
{
    printf("\n%f", i->CGPA);
    printf("\n%d", i->roll_no);
    printf("\n%s", i->name);
}

int main()
{
    struct info s834;
    s834.name = "Srijan";
    s834.CGPA = 8.97;
    s834.roll_no = 2005834;

    display(&s834);

    return 0;
}