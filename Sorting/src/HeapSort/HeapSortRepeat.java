package HeapSort;

public class HeapSortRepeat {
    private int[] array;
    public HeapSortRepeat(int[] array)
    {
        this.array = array;
    }

    public void Sort()
    {
        // create a pyramid structure
        for (int i = array.length / 2 - 1; i >= 0; i--)
        {
            Down(array.length, i);
        }

        // sorting
        for (int j = array.length - 1; j >= 0; j--)
        {
            Swap(j, 0);
            Down(j, 0);
        }
    }
    public void Down(int size, int root)
    {
        int X = root;
        int L = 2 * root + 1;
        int R = L + 1;
        if (size > L && array[L] > array[X])
        {
            X = L;
        }
        if (size > R && array[R] > array[X])
        {
            X = R;
        }
        if (X == root)
        {
            return;
        }
        Swap(root, X);
        Down(size, X);
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
