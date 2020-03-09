#pragma once
#include<iostream>

using namespace std;

int myprint(int * arr, int size) 
{
  for (int i = 0; i < size; i++) {
    cout << arr[i] << " ";
  }
  cout << endl;
  return 0;
}

int swap(int * arr, int x, int y)
{
  int temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;

  return 0;
}

