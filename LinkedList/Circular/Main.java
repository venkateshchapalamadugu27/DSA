package LinkedList.Circular;

public class Main {
    public static void main(String[] args) {
        circularLL list=new circularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(1);
        list.display();
    }
}
