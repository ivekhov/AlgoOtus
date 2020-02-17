import Examples.FactorArray;
import Examples.IArray;
import Examples.SingleArray;
import Structures.*;

public class Program {
    public static void main(String[] args){
        IArray<String> singleArray = new SingleArray<>();
        IArray<String> factorArray = new FactorArray<>();
        addValues(factorArray, 1_000);
        getValues(factorArray, 1_000);

    }

    public static void addValues(IArray<String> array, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            array.add(i + "");
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println("Add " + array + " " + count + " " + duration + " ms");
    }

    public static void getValues(IArray<String> array, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            array.get(i);
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println("Get from  " + array + " " + count + " " + duration + " ms");
    }

}



//        Queue myQueue = new Queue();
//        myQueue.push(42);
////        System.out.println(myQueue.getCurIndex());
//        myQueue.push(9999);
////        System.out.println(myQueue.getCurIndex());
//        long a = myQueue.pop();
//        long b = myQueue.pop();
//        System.out.println(a);
//        System.out.println(b);
//
//        for (int i = 0; i < 10000; i++) {
//            myQueue.push(i);
//        }
//        myQueue.pop();
//        myQueue.pop();
//        myQueue.pop();
//        for (int i = 0; i < 17 ; i++) {
//            System.out.println(myQueue.getItem(i));
//            System.out.println(myQueue.getNElems());
//        }



//        Stack myStack = new Stack();
//        myStack.push(42);
//        myStack.push(9999);
//        long a = myStack.pop();
//        long b = myStack.pop();
//        System.out.println(a);
//        System.out.println(b);



//        int[][] a = new int[10][5];
//        System.out.println(a.length);
//        a[11][1] = 42;
//        System.out.println(a.length);



//        FactorArray myFactorArr = new FactorArray();
//        for (int i = 0; i < 10000; i++) {
//            myFactorArr.add(i, i);
//        }
////        myFactorArr.remove(3);
//        for (int i = 0; i < 17 ; i++) {
//            System.out.println(myFactorArr.getItem(i));
//            System.out.println(myFactorArr.getNElems());
//        }

//        System.out.println(2 % (2 / 2));

//        SingleArray mySingleArr = new SingleArray();
//        mySingleArr.add(42, 0);
//        mySingleArr.add(99, 1);
//        mySingleArr.add(1000, 2);
//        mySingleArr.remove(1);
//        for (int i = 0; i < mySingleArr.getArrLen() ; i++) {
//            System.out.println(mySingleArr.getItem(i));
//        }
