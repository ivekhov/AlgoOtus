package Structures;

public class PriorityQueue {
    private Queue[] priorQ = new Queue[0];

    public PriorityQueue(){ }
    public void enqueue(int priority, long item){
        if (priority < priorQ.length || priority == 0){
            // resize list of attays -- extend it;
        } else {
            priorQ[priority].push(item);
        }
    }
    public void dequeue(){
        //
    }




//    private VectorArray[] priorQ = new VectorArray[0];
//
//    public PriorityQueue(){ }
//    public void enqueue(int priority, long item){
//        priorQ[priority].add(item, priorQ[priority].getArrLen());
//    }
//    public void dequeue(){
//        //
//    }

}
