#pragma once
#include<iostream>
#include "../myfunc.hpp"

using namespace std;

void mergeSort(int * arr, int left, int right)
{
  void merge(int * arr, int left, int center, int right);

  if (left >= right) return;
  int center = left + (int)((right - left) / 2);
  
  mergeSort(arr, left, center);
  mergeSort(arr, (center + 1), right);
  merge(arr, left, center, right);

}

void merge(int * arr, int left, int center, int right)
{
  int a = left;
  int b = center + 1;
  int s = 0;
  int S[right - left + 1];

  while (a <= center && b <= right) {
    if (arr[a] < arr[b]) S[s++] = arr[a++]; 
    else S[s++] = arr[b++];
  }
  while (a <= center) S[s++] = arr[a++]; 
  while (b <= right) S[s++] = arr[b++];

  for (int i = left; i <= right; i++) {
    arr[i] = S[i - left];
  }

}

