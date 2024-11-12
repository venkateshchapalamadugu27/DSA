package LinkedList.Double;

public class Main {
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
//        list.display();
//          list.insertLast(5);
//        list.displayReverse();
//          list.display();
//         list.displayReverse();

        list.insert(1,5);
        list.display();
    }
}
