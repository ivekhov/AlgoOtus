package Examples;


public class Queue<T>{
    private VectorArray queue;
    private int curIndex;
    private int firstIndex;

    // ToDO
    public Queue(){
        queue = new VectorArray();
        firstIndex = 0;
        curIndex = -1;
    }
//    public void enqueue(long item){
//        queue.add(item, ++curIndex);
//    }
    public T dequeue(){
        T temp = (T) queue.get(firstIndex);
//        queue.remove(firstIndex);  // ToDo
        return temp;
    }
    public T get(int index){
        return (T) queue.get(index);
    }
    public int getCurIndex(){
        return firstIndex;
    }
}
