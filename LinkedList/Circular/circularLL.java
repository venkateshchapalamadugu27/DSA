package LinkedList.Circular;

public class circularLL {
    private Node head;
    private Node tail;
    public circularLL() {
        this.head=null;
        this.tail=null;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        tail=node;
        node.next=head;
    }
    public void display(){
        Node temp=head;
        if (temp!=null){
            do {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node temp=head;
        if(temp==null){
            return ;
        }
        if(temp.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n=temp.next;
            if(n.val==val){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);

    }
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }
}
