#pragma once
#include <iostream>
#include "../myfunc.hpp"

using namespace std;

int bubbleSort(int * arr, int size)
{
  for (int i = 1; i < size; i++) {
    for (int j = i; j > 0; j--) {
      if(arr[j - 1] > arr[j]) swap(arr, (j-1), j);
    }
  }

  return 0;
}

