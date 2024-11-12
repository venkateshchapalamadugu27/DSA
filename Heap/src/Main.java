import java.util.ArrayList;
import java.util.PriorityQueue;

//import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {


         Heap<Integer> heap=new Heap<>();


         heap.insert(34);
         heap.insert(45);
         heap.insert(22);
         heap.insert(89);
         heap.insert(76);

//        System.out.println(heap.remove());

        ArrayList list=heap.heapSort();
        System.out.println(list);

        priorityQueue();

    }

    private static void priorityQueue(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(34);
        pq.add(45);
        pq.add(22);
        pq.add(89);
        pq.add(76);
//        pq.toArray();
        System.out.println(pq);

        int[] num=new int[50];
        num[4+1]=6;
        System.out.println();
    }

}