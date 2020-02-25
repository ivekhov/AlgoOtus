package Examples;

public class MatrixArray<T> implements IArray<T> {
    private int increment;
    private int nElems;
    private IArray<IArray<T>> array;

    public MatrixArray(int increment){
        this.increment = increment;
        array = new FactorArray<>();
        nElems = 0;
    }
    public MatrixArray(){
        this(10);
    }
    @Override
    public int size() {
        return nElems;
    }

    @Override
    public void add(T item) {
        if (array.size() * increment == size() ){
            array.add(new VectorArray<T>(increment));
        }
        int index = size();
        array.get(index / increment).add(item);
        nElems++;
    }

    @Override
    public T get(int index) {
        int first = index / increment;
        int second = index % increment;
        return array.get(first).get(second);
    }
}


//        System.out.println("index: " + index);
//        System.out.println("nelems: " + nElems);
//        System.out.println("index _ elem: " + index / increment);
//        System.out.println("array size: " + array.size());
//        System.out.println("array elem: " + array.get(index / increment)); //
//        array.get(index / increment).add(item);
////        nElems++;