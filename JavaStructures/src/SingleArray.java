public class SingleArray {
    private int size;
    private int[] arr;

    public SingleArray() {
        arr = new int[0];
        size = 0;
    }

    public void add(int index, int item){
        //
    }

    public void remove(int index){
        //
    }

    public void resize(int increase) {
        int[] newArr = new int[arr.length + increase];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
    }

}
