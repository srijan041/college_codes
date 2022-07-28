#include <iostream>
using namespace std;


void printCalculations(int arr[50][50], int n){
    int nonZero = 0;
    int leadDiagSum = 0;
    int prod = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
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
    

    cout << endl;

    cout << "Number of non-zero elements = " << nonZero << endl;
    cout << "Sum of elements above leading diagonal = " << leadDiagSum << endl;

    cout << "Product of diagonal elements = " << prod << endl;
}

int main()
{
    int n;
    cout << "Enter n: ";
    cin >> n;
    int arr[50][50];
    cout << "Enter values for array" << endl;
    

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
            
        }
    }

    cout << "Array: ";
    cout << endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << "  ";
        }
        cout << endl;
    }

    
    printCalculations(arr, n);

    cout << "Elements below minor diagonal: " << endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (j+i >= n)
                cout << arr[i][j] << "  ";
            else
                cout << "   ";
        }
        cout << endl;
    }

    

    return 0;
}