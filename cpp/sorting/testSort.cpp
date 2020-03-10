#include<iostream>
#include "myfunc.hpp"
#include "./BubbleSort/BubbleSort.hpp"
#include "./SelectionSort/SelectionSort.hpp"
#include "./InsertionSort/InsertionSort.hpp"
#include "./ShellSort/ShellSort.hpp"
#include "./HeapSort/HeapSort.hpp"
#include "./MergeSort/MergeSort.hpp"


using namespace std;

int main()
{
  int size = 9;
  int arr[size] = {981, 0, -13, 42, 7, 5, -65, 3, 22};

  myprint(arr, size);

  mergeSort(arr, 0, 8); 


//  heapSort(arr, size);
//  shellSortThird(arr, size);
//  shellSortSecond(arr, size);
//  shellSortFirst(arr, size, 2);
  
//  insertionSort(arr, size);
//  bubbleSort(arr, size);
//  selectionSort(arr, size);

  myprint(arr, size);
  
//  int size = 100000;
//  int arr[size] = ;


  return 0;
}
