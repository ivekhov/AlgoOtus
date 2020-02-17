package Structures;

public class FactorArray {
    private int increment = 8;
    private long[] a = new long[1];
    private int nElems = 0;
    private int multiplicator = 2;

    public FactorArray() { }
    public void add(long item, int index){
        long[] replacer;
        if (nElems == a.length && nElems != 0){
            replacer = extend(multiplicator);
        } else {
            replacer = extend(1);
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
        if ( nElems % (a.length / 2) == 1 ||  nElems == 2){
            replacer = extend((1/multiplicator));
        } else {
            replacer = extend(1);
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
        long[] newArr = new long[a.length * step];
        return newArr;
    }
    public int getArrLen() {
        return a.length;
    }
    public long getItem(int index){
        return a[index];
    }
    public long getNElems(){return nElems; }
}
