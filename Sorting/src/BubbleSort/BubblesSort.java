package BubbleSort;

public class BubblesSort {
    private int[] array;
    public BubblesSort(int[] array)
    {
        this.array = array;
    }
    public void BubblesSort()
    {
        for (int i = 1; i < array.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (array[j] < array[j - 1])
                {
                    Swap(j, j - 1);
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
