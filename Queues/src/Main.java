import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

//        System.out.println("Hello world!");

        CustomQueue queue=new CustomQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.front());
        queue.display();

//        Deque<Integer> q=new LinkedList<>();
//        q.addFirst(3);
////        q.ge
    }
}