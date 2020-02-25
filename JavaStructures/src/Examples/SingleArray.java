package Examples;

public class SingleArray<T> implements IArray<T> {

    private T[] array;

    public SingleArray(){
        array = (T[])new Object[0];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(T item) {
        array = resize(array, 1);
        array[size()-1] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    public T[] resize(T[] array, int delta){
//        T[] ts = new T[size() + delta];
        T[] newArr = (T[])new Object[size() + 1]; // cast to T from Object type is needed

//        for (int i = 0; i < array.length; i++) { newArr[i] = array[i]; }  // manual copy
        System.arraycopy(array, 0, newArr, 0, array.length);  // system lib method call

        return newArr;
    }
}
