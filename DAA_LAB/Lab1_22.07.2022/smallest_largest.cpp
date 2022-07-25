#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter n" << endl;
    cin >> n;
    int arr[n];
    cout << " Enter values for array" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int largest = 0;
    int smallest = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > arr[largest])
            largest = i;

        if (arr[i] < arr[smallest])
            smallest = i;
    }

    cout << "Smallest = " << arr[smallest] << " largest = " << arr[largest] << endl;

    return 0;
}