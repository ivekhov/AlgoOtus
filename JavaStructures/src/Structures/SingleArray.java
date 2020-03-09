package Structures;

public class SingleArray{
    private long[] a = new long[0];
    public SingleArray() {
        long[] a;
    }
    public void add(long item, int index){
        long[] replacer = extendAndCopy(1);
        for (int i = replacer.length-1; i > index; i--) {
            replacer[i] = replacer[i-1];
        }
        replacer[index] = item;
        a = replacer;
    }
    public void remove(int index){
        long[] replacer = new long[a.length-1];
        for (int i = 0; i < index; i++) {
            replacer[i] = a[i];
        }
        for (int i = index+1; i < a.length; i++) {
            replacer[i-1] = a[i];
        }
        a = replacer;
    }
    public long[] extendAndCopy(int step){
        long[] newArr = new long[a.length+step];
        if (a.length == 0){
            return newArr;
        }
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        return newArr;
    }
    public int getArrLen() {
        return a.length;
    }
    public long getItem(int index){
        return a[index];
    }
}
