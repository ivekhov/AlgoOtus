package ShellSort;

public class ShellSort
{
    int[] array;
    public ShellSort(int[] array)
    {
        this.array = array;
    }
    public void sortAnother(int param)
    {
        int h = 1;
        while (h < array.length / param)
        {
            h = h * param + 1;
        }
        while (h >= 1)
        {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && (array[j] >= array[j - h]); j -= h)
                {
                    Swap(j, j - h);
                }
            }
            h /= param;
        }
    }

    public boolean isSorted()
    {
        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }
    public void Sort()
    {
        for (int inc = array.length / 2; inc >= 1; inc /= 2)
        {
            for(int step = 0; step < inc; step++)
            {
                insertionSort(step, inc);
            }
        }
    }
    public void insertionSort(int start, int inc)
    {
        for (int i = start; i < array.length - 1; i += inc)
        {
            for (int j = Math.min(i + inc, array.length - 1); j - inc >= 0 ; j++)
            {
                if (array[j - inc] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - inc];
                    array[j - inc] = temp;
                } else break;
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
