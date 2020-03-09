package Structures;

public class VectorArray {
    private int increment = 8;
    private long[] a = new long[increment];
    private int nElems = 0;

    public VectorArray() { }
    public void add(long item, int index){
        long[] replacer;
        if (nElems % increment == 0 && nElems != 0){
            replacer = extend(increment);
        } else {
            replacer = extend(0);
        }
        for (int i = 0; i < index; i++) {
            replacer[i] = a[i];
        }
        replacer[index] = item;
        for (int i = index+1; i < nElems; i++) {
            replacer[i+1] = a[i];
        }
        a = replacer;
        nElems++;
    }
    public void remove(int index){
        long[] replacer;
        if (nElems % increment == 1 && nElems > increment){
            replacer = extend(-increment);
        } else {
            replacer = extend(0);
        }
        for (int i = 0; i < index; i++) {
            replacer[i] = a[i];
        }
        for (int i = index+1; i < nElems; i++) {
            replacer[i-1] = a[i];
        }
        a = replacer;
        nElems--;
    }
    public long[] extend(int step){
        long[] newArr = new long[a.length+step];
        return newArr;
    }
    public int getArrLen() {
        return a.length;
    }
    public long getItem(int index){
        return a[index];
    }

// rewrite it not for long but for Objects
// this will help to use Vector Array with Objects, like Queue-s

}
