package Examples;

public class FactorArray<T> implements IArray<T> {
    private T[] array;
    private int increment;
    private int nElems;

    public FactorArray(int increment){
        array = (T[])new Object[0];
        this.increment = increment;

    }
    public FactorArray(){
        this(2);
    }
    public T[] resize(T[] array, int delta){
        T[] newArr;
        if (array.length == 0) {
            newArr = (T[])new Object[1]; // cast to T from Object type is needed
        } else {
            newArr = (T[])new Object[size() * delta]; // cast to T from Object type is needed
        }
        System.arraycopy(array, 0, newArr, 0, array.length);  // system lib method call
        return newArr;
    }

    @Override
    public int size() {
//        return array.length;
        return nElems;
    }

    @Override
    public void add(T item) {
        if(nElems == array.length) {
            array = resize(array, increment);
        }
        array[nElems] = item;
        nElems++;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
