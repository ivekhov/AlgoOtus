#include<stdio.h>

int main(void){
    int arr[9] = {1, 42, 99, -1, 65, 17, 9 , 5, 0};
    int my_print();
    my_print(arr, sizeof(arr) / sizeof(arr[0]));
    
    void swap();
    int x = 1;
    int y = 5;
    swap(arr, x, y);  
    my_print(arr, sizeof(arr) / sizeof(arr[0]));
    
    void bubbleSort();
    bubbleSort(arr, sizeof(arr) / sizeof(arr[0]));
    my_print(  arr, sizeof(arr) / sizeof(arr[0]));
    return 0; 
}
void bubbleSort(int * arr, int size){
    void swap();
    int key;
    for(int i = 0; i != size; ++i){
        for(int j = i; j > 0; --j){
            key = j - 1;
            if(arr[j] < arr[key]) swap(arr, j, key);
        }
    }
}
int my_print(int *temp, int size){
    for(int i = 0; i !=  size; ++i) printf("%d ", temp[i]);
    printf("\n");

    return 0;
}
void swap(int * arr, int x, int y){
    int temp;
    temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

