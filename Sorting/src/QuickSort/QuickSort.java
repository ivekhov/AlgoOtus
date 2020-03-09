package QuickSort;

public class QuickSort {
    private int[] array;
    public QuickSort(int[] array)
    {
        this.array = array;
    }
    public void Sort(int left, int right)
    {
        if (left >= right) return;

        int center = partition(left, right);
        Sort(left, center - 1);
        Sort(center + 1, right);

    }
    public int partition(int left, int right)     // int pivot
    {
        // int i = - 1;
        int i = left - 1;

        //
        int pivot = array[right];

//        for (int j = 0; j < array.length; j++)
        for (int j = left; j <= right; j++)
        {
            if (array[j] <= pivot)
            {
                i++;
                Swap(i, j);
            }
        }
        return i;
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
