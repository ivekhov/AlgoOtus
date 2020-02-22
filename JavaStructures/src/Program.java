<<<<<<< HEAD
import Structures.*;
import Structures.SingleArray;
=======
import Examples.FactorArray;
import Examples.IArray;
import Examples.MatrixArray;
import Examples.SingleArray;
import Examples.VectorArray;
import Examples.SpaceArray;
import Structures.*;
>>>>>>> 4fd492291684d3d2b89cac070d0f7294b409dcb8

public class Program {
    public static void main(String[] args){

<<<<<<< HEAD
        VectorArray[][] pq = new VectorArray[0][0];
=======
//        System.out.println(49%50);
//        System.out.println(50%50);
//        System.out.println(51%50);

        IArray<String> spaceArray = new SpaceArray<>();
        addValues(spaceArray, 100);
        getValues(spaceArray, 100);





//        IArray<String> matrixArray = new MatrixArray<>();
//        addValues(matrixArray, 100_000);
//        getValues(matrixArray, 100_000);



//        IArray<String> singleArray = new SingleArray<>();
//        IArray<String> factorArray = new FactorArray<>();
//        addValues(factorArray, 1_000);
//        getValues(factorArray, 1_000);

//        IArray<String> vectorArray = new VectorArray<>();
//        addValues(vectorArray, 1_000);
//        getValues(vectorArray, 1_000);




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
//            System.out.println(array.get(i));
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println("Get from  " + array + " " + count + " " + duration + " ms");
    }

}
>>>>>>> 4fd492291684d3d2b89cac070d0f7294b409dcb8



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
<<<<<<< HEAD


    }
}

=======
>>>>>>> 4fd492291684d3d2b89cac070d0f7294b409dcb8
