package SelectSort;

public class SelectSort {
    private int[] array;
    public SelectSort(int[] array)
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
                    Swap(i, j);
                }
            }
        }
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
