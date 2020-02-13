public class StructuresMain {
    public static void main(String[] args){
//        SingleArray arr;

        int[] arr = new int[1];
        arr[0] = 42;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}

