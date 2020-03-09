#pragma once
#include<iostream>
#include "../myfunc.hpp"

int heapSort(int * arr, int size) {
    void down(int * arr, int size, int root);
    
    for (int i = size / 2 - 1; i >= 0; i-- ) {
        down(arr, size, i);
    }
    for (int j = size - 1; j >= 0; j--) {
        swap(arr, j, 0);
        down(arr, j, 0);  
    }

    return 0;
}

void down(int * arr, int size, int root) {
    int X = root;
    int L = 2 * root + 1;
    int R = L + 1;

    if (size > L && arr[L] > arr[X] ) X = L;
    
    if (size > R && arr[R] > arr[X] ) X = R;

    if (X == root) return;
    
    swap(arr, root, X);  
    down(arr, size, X);    
}

