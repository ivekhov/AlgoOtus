package Examples;

public interface IArray<T> {
    int size();
    void add(T item);
    T get (int index);

    // to write
//    void add(T item, int index);
//    T remove(int index);



    // default method in interface
//    default public T[] resize(T[] array, int delta){
//        T[] newArr = (T[])new Object[size() + 1]; // cast to T from Object type is needed
//        System.arraycopy(array, 0, newArr, 0, array.length);  // system lib method call
//        return newArr;
//    }
}
