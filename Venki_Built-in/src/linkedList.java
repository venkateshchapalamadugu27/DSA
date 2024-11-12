import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3,40);
        list.addLast(50);
        list.addFirst(0);
        System.out.println(list.indexOf(10));
        System.out.println(list.remove());
        System.out.println(list);
        list.set(2,60);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
