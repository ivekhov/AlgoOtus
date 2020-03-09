#include <iostream>
#include "../myfunc.hpp"

using namespace std;

int main()
{
  int size = 9;
  int arr[size] = {981, 0, -13, 42, 7, 5, -65, 3, 22};
  int bubbleSort(int * arr, int size);


  myprint(arr, size);
  bubbleSort(arr, size);
  myprint(arr, size);

  return 0;
}

int bubbleSort(int * arr, int size)
{
  for (int i = 1; i < size; i++) {
    for (int j = i; j > 0; j--) {
      if(arr[j - 1] > arr[j]) swap(arr, (j-1), j);
    }
  }

  return 0;
}


