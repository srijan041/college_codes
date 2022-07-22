// wap to extract each byte from a give number

#include <stdio.h>

int main()
{

    int n = 258;
    int s = 24;
    for (int i = 0; i < 4; i++)
    {
        printf("%d\t", (n >> s) & 0xFF);
        s = s - 8;
    }
    return 0;
}