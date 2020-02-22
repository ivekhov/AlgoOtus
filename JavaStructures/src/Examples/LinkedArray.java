package Examples;

public class LinkedArray<T> implements IArray<T> {

    private Queue<T> queue;
    private int size;

    public LinkedArray(){
        this.queue = new Queue<>();
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        // ToDo
//        queue.enqueue(item);
//        size++;

    }

    @Override
    public T get(int index) {
        if (index >= size) { return null; }


        return null;
    }
}
