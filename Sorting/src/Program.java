import HeapSort.HeapSort;
import BubbleSort.BubblesSort;
import InsertionSort.InsertionSort;
import SelectSort.SelectSort;
import ShellSort.ShellSort;

public class Program {
    public static void main(String[] args)
    {
        int[] arr = {5, 7 ,2, 4 ,3, 9, 1, 0, 6, 8, 42, 17, 99, -2, -999, 100012};
        ShellSort myShellSort = new ShellSort(arr);
        myShellSort.Print();
        myShellSort.sortAnother(2);
        myShellSort.Print();

//         InsertionSort myInsertionSort = new InsertionSort(arr);
//         myInsertionSort.Print();
//         myInsertionSort.Sort();
//         myInsertionSort.Print();

//        SelectSort mySelectSort = new SelectSort(arr);
//        mySelectSort.Print();
//        mySelectSort.Sort();
//        mySelectSort.Print();

//        BubblesSort myBubblesSort = new BubblesSort(arr);
//        myBubblesSort.Print();
//        myBubblesSort.BubblesSort();
//        myBubblesSort.Print();

//        HeapSort myHeapSort = new HeapSort(arr);
//        myHeapSort.HeapSort();
    }
}
