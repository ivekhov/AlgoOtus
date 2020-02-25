package HeapSort;

public class HeapSort
    {
    private int[] array;
    public HeapSort(int[] array)
    {
        this.array = array;
    }
    public void HeapSort()
    {
//        Print();
        for (int i = array.length / 2 - 1; i >= 0 ; i--)
        {
            Down(array.length, i);
        }
//        Print();
//        return;
//        Down(array.length, 0); // put max in the begining
//        Print();


//        Swap(0, array.length - 1); // replace elem in 0 position and put to the end
//        Down(array.length - 1, 0); // repeat first step: go to shorten version of array
        // better way - make a loop
        for (int i = array.length - 1; i >= 0; i--)
        {
            Swap(0, i);
//            Print();
            Down(i, 0);
//            Print();
        }

    }
    // take max element and put in the place needed (root)
    // size of field for search, root - place where put max value
    public void Down(int size, int root)
    {
        // olderway without tree
//        for (int i = root + 1; i < size; i++)
//        {
//            if (array[i] > array[root]) Swap(i, root);
//        }

        // way for tree
        int L = root * 2 + 1; // 2n + 1
        int R = L + 1;        // right = left + 1
        int X = root;
        if (L < size && array[L] > array[X]) X = L;
        if (R < size && array[R] > array[X]) X = R;
        if (X == root) return;
        Swap(X, root);
        Down(size, X);


        //
    }
    public void Swap(int a, int b)
    {
        int x = array[b];
        array[b] = array[a];
        array[a] = x;
    }
    public void Print()
    {
        for (int x: array)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
