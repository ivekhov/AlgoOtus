#include <iostream>
#include "../myfunc.hpp"

using namespace std;

int insertionSort(int * arr, int size) {
	
	for (int i = 0; i < size; i++) {
    	int indexLoc = i;
	    int minLoc = arr[indexLoc];
		
        for (int j = i; j < size; j++) {
			if (arr[j] < minLoc) { 
                minLoc = arr[j];
                indexLoc = j;
            }
        }        
        swap(arr, indexLoc, i);
    }

	return 0;
}

