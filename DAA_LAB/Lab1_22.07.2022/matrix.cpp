#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n][n];
    cout << "Enter values for array" << endl;
    int nonZero = 0;
    int leadDiagSum = 0;
    int prod = 1;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
            if (arr[i][j] != 0)
                nonZero++;

            if (j > i)
            {
                leadDiagSum += arr[i][j];
            }

            if (i == j)
                prod *= arr[i][j];
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << "  ";
        }
        cout << endl;
    }

    cout << endl;

    cout << "Nonzero = " << nonZero << endl;
    cout << "Sum = " << leadDiagSum << endl;
    cout << endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i > j)
                cout << arr[i][j] << "  ";
        }
        cout << endl;
    }

    cout << endl;

    cout << "Product = " << prod << endl;

    return 0;
}