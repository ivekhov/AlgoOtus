package ShellSort;

public class ShellSort
{
    int[] array;
    public ShellSort(int[] array)
    {
        this.array = array;
    }
    public void sortForth()
    {
        int parameter = 0;
        int h = calcStepThird(parameter, 1);
        while (h < array.length)
        {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && (array[j] <= array[j - h]); j -= h)       //  decrease|increase < or > in 53 symbol
                {
                    Swap(j, j - h);
                }
            }
            parameter += 1;
            h = calcStepThird(parameter, 1);
        }
    }
    public void sortThird()
    {
        int parameter = 1;
        int h = calcStepThird(parameter, -1);
        while (h < array.length)
        {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && (array[j] <= array[j - h]); j -= h)       //  decrease|increase < or > in 53 symbol
                {
                    Swap(j, j - h);
                }
            }
            parameter += 1;
            h = calcStepThird(parameter, -1);
        }
    }
    public int calcStepThird(int parameter, int sign)
    {
        int i = (int) Math.pow(2, parameter) + sign;
        return i;
    }
    public void sortSecond()
    {
        int parameter = 1;
        int h = calcStepSecond(parameter);
        while (h >= 1)
        {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && (array[j] <= array[j - h]); j -= h)       //  decrease|increase < or > in 53 symbol
                {
                    Swap(j, j - h);
                }
            }
            h = calcStepSecond(++parameter);
        }
    }
    public int calcStepSecond(int parameter)
    {
        var i = (int) (2 * (array.length / Math.pow(2, parameter + 1)));
        return i;
    }
    public void sortFirst(int param)
    {
        int h = 1;
        while (h < array.length / param)
        {
            h = h * param + 1;
        }
        while (h >= 1)
        {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && (array[j] <= array[j - h]); j -= h)       //  decrease|increase < or > in 53 symbol
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
