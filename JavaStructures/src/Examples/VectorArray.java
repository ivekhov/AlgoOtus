package Examples;

public class VectorArray<T> implements IArray<T> {

    private T[] array;
    private int increment;
    private int nElems;

    public VectorArray(int increment){
        array = (T[])new Object[0];
        this.increment = increment;
    }

    public VectorArray(){
        this(100);
    }

    @Override
    public int size() {
        return nElems;
    }

    @Override
    public void add(T item) {
        if (nElems == array.length) {
            array = resize(array, increment);
        }
        array[nElems] = item;
        nElems++;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    public T[] resize(T[] array, int delta){
        T[] newArr = (T[])new Object[size() + delta]; // cast to T from Object type is needed
        System.arraycopy(array, 0, newArr, 0, array.length);  // system lib method call
        return newArr;
    }

    // ToDo
//    public T remove(int index) {}

}
