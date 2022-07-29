#include <iostream>
using namespace std;

bool primeMethodJod(int n)
{
    if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 11 == 0)
    {
        return false;
    }

    return ((n + 1) / 6.0 == (n + 1) / 6 || (n - 1) / 6.0 == (n - 1) / 6);
}

int main()
{
    int n;
    cin >> n;

    cout << primeMethodJod(n) << endl;
}