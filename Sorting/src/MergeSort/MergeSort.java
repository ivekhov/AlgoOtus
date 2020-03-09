package MergeSort;

import java.util.SortedMap;

public class MergeSort {
    private int[] array;
    public MergeSort(){}
    public MergeSort(int[] array)
    {
        this.array = array;
    }
    public void Sort(int left, int right)
    {
        if (left >= right) return;
//        int center = (left + right) / 2;   // may happen overflow type
        int center = left + (right - left ) / 2;
        Sort(left, center);
        Sort(center + 1, right);
        merge(left, center, right);
    }
    public void merge(int left, int center, int right)
    {
        int[] S = new int[right - left + 1];
        int a = left;
        int b = center + 1;
        int s = 0;

        while(a <= center && b <= right)
        {
            if(array[a] < array[b])  S[s++] = array[a++];
            else S[s++] = array[b++];
        }
        while (a <= center) S[s++] = array[a++];
        while (b <= right) S[s++] = array[b++];
        for (int i = left; i <= right; i++)
        {
            array[i] =  S[i - left];
        }
    }

    public int[] mergeOld(int[] A, int[] B)
    {
        int a = 0;
        int b = 0;
        int[] S = new int[A.length + B.length];
        int s = 0;
        while (A.length > a && B.length > b)
        {
            if (A[a]  < B[b]) S[s++] = A[a++];
            else S[s++] = B[b++];
        }
        while (a < A.length)    S[s++] = A[a++];
        while (b < B.length)    S[s++] = B[b++];
        return S;
    }
    public void Swap(int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public void Print()
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
