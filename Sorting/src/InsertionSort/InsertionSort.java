package InsertionSort;

public class InsertionSort {
    private int[] array;
    public InsertionSort(int[] array)
    {
        this.array = array;
    }
    public void Sort()
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    Shift(i, j - 1, j);
                }
            }
        }
    }
    public void Shift(int first, int last, int destination)
    {
        int temp = array[destination];
        for (int i = destination; i > first; i--)
        {
            array[i] = array[i - 1];
        }
        array[first] = temp;
    }
    public void Swap(int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public void Print()
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
