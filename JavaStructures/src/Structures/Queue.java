package Structures;

public class Queue {
    private VectorArray queue;
    private int curIndex;
    private int firstIndex;

    public Queue(){
        queue = new VectorArray();
        firstIndex = 0;
        curIndex = -1;
    }
    public void push(long item){
        queue.add(item, ++curIndex);
    }
    public long pop(){
        long temp = queue.getItem(firstIndex);
        queue.remove(firstIndex);
        return temp;
    }
    public long getItem(int index){
        return queue.getItem(index);
    }
    public int getCurIndex(){
        return firstIndex;
    }
}
