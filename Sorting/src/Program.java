import HeapSort.HeapSort;

public class Program {
    public static void main(String[] args)
    {
        int[] arr = {5, 7 ,2, 4 ,3, 9, 1, 0, 6, 8};
        HeapSort myHeapSort = new HeapSort(arr);
        myHeapSort.HeapSort();

    }
}
