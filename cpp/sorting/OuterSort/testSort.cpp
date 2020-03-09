#include<iostream>
#include "myfunc.hpp"
#include "./BubbleSort/BubbleSort.hpp"
#include "./SelectionSort/SelectionSort.hpp"
#include "./InsertionSort/InsertionSort.hpp"

using namespace std;

int main()
{
  int size = 9;
  int arr[size] = {981, 0, -13, 42, 7, 5, -65, 3, 22};

  myprint(arr, size);
  bubbleSort(arr, size);
//  selectionSort(arr, size);
  myprint(arr, size);
  
//  int size = 100000;
//  int arr[size] = ;


  return 0;
}
