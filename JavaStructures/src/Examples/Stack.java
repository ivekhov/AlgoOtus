package Examples;


public class Stack {
    private VectorArray stack;
    private int curIndex;

    public Stack(){
        stack = new VectorArray();
        curIndex = -1;
    }
//    public void push(long item){
//        stack.add(item, ++curIndex);
//    }
//    public long pop(){
//        long temp = stack.getItem(curIndex);
//        stack.remove(curIndex--);523
//        return temp;
//    }
//    public long getItem(int index){
//        return stack.getItem(index);
//    }
    public int getCurIndex(){
        return curIndex;
    }

}
