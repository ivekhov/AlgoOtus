#include<iostream>
#include "../myfunc.hpp"

using namespace std;

int selectionSort(int * arr, int size) {
  for (int i = 1; i < size; i++) {
    for (int j = i; j > 0; j--) {
      if (arr[j - 1] > arr[j])  swap(arr, j, (j - 1)); 
    }
  }

  return 0;
}

