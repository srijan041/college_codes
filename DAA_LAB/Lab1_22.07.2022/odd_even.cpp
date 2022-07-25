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

    int evenCOunt = 0;
    int oddCOunt = 0;
    int evenArr[n];
    int oddArr[n];

    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
        {
            evenArr[evenCOunt++] = arr[i];
        }
        else
        {
            oddArr[oddCOunt++] = arr[i];
        }
    }

    for (int i = 0; i < evenCOunt; i++)
    {
        cout << evenArr[i] << " ";
    }

    for (int i = 0; i < oddCOunt; i++)
    {
        cout << oddArr[i] << " ";
    }
    return 0;
}