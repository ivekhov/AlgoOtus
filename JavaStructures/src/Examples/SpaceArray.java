package Examples;

public class SpaceArray<T> implements IArray<T> {
    private int increment;
    private int nElems;
    private IArray<IArray<T>> array;

    public SpaceArray(int increment){
        this.increment = increment;
        array = new FactorArray<>();
        nElems = 0;
    }
    public SpaceArray(){
        this(10);
    }

    @Override
    public int size() {
        return nElems;
    }

    @Override
    public void add(T item) {
        int index = 0;
        if (array.size() * increment * 0.5 == size()   ) {
            array.add(new VectorArray<T>(increment));
        }
        index = size();
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
