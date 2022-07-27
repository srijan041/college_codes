#include <iostream>
using namespace std;

void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}


//10,20,20,30,30,30
//1,2,3,4,5,6
int numOfDuplicates(int arr[], int n){
    int count = 0;
    for(int i = 1; i < n; i++){
        if(arr[i] == arr[i-1])
            count++;
    }
    return count;
}


int mostRepeatCount(int arr[], int n){
    int max = 1;
    int temp = 1;
    int num = arr[0];
    for(int i = 1; i < n; i++){
        if(arr[i] == arr[i-1])
            temp++;
        else{
            if(temp > max){
                max = temp;
                num = arr[i-1];
            }
            temp = 0;
        }
    }
    if(temp > max)
        return arr[n-1];
    return num;

}

int main()
{

    int n;
    cout << "Enter n" << endl;
    cin >> n;
    int arr[n];
    cout << "Enter values for array" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    insertionSort(arr, n);

    cout << "Total number of duplicates = " << numOfDuplicates(arr, n) << endl;
    cout << "Most repeating element = " << mostRepeatCount(arr, n) << endl;

    return 0;
}