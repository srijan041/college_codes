#include <iostream>
using namespace std;

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{

    int a, b, c;
    cin >> a >> b >> c;

    swap(&a, &b);
    swap(&a, &c);

    cout << "A = " << a << " B = " << b << " C = " << c << endl;

    return 0;
}