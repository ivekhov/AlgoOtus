#pragma once
#include <iostream>
#include <math.h>
#include "../myfunc.hpp"

using namespace std;

int shellSortFirst(int * arr, int size, int param)
{
	int h = 1;
	while (h < size / param)
	{
		h = h * param + 1;
	}
	
	while (h >= 1)
	{
		for (int i = h; i < size; i++) {
			for (int j = i; j >= h && (arr[j] <= arr[j - h]); j -= h)
			{
				swap(arr, j, (j - h));
			}
		}
		h /= param;
	}
	
	return 0;
}

int calcStepSecond(int param, int size)
{
	int i = (int)(2 * (size / pow(2, (param + 1))));
	return i;
}
  
int shellSortSecond(int * arr, int size)
{
	int param = 1;
	int h = calcStepSecond(param, size);
	while (h >= 1)
  {
    for (int i = h; i < size; i++) {
			for (int j = i; j >= h && (arr[j] <= arr[j - h]); j -= h) 
      {
        swap(arr, j, (j - h));
      }
    }  

    h = calcStepSecond(++param, size);
  }

	return 0;
}

int calcStepThird(int param, int sign)
{
  int i = (int) pow(2, param) + sign;  

  return i;
}

int shellSortThird(int * arr, int size)
{
	int param = 1;
	int h = calcStepThird(param, -1);
	while (h < size)
  {
    for (int i = h; i < size; i++) {
			for (int j = i; j >= h && (arr[j] <= arr[j - h]); j -= h) 
      {
        swap(arr, j, (j - h));
      }
    }  
    param += 1;
    h = calcStepThird(param, -1);
  }

	return 0;
}


int shellSortForth(int * arr, int size)
{
	int param = 0;
	int h = calcStepThird(param, 1);
	while (h < size)
  {
    for (int i = h; i < size; i++) {
			for (int j = i; j >= h && (arr[j] <= arr[j - h]); j -= h) 
      {
        swap(arr, j, (j - h));
      }
    }  
    param += 1;
    h = calcStepThird(param, 1);
  }

	return 0;
}


