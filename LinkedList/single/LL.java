package LinkedList.single;

public class LL {
    private int size;
    private Node head;
    private Node tail;
    public LL(){
        this.size=0;
    }
    private class Node{
        int value;
        Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
             tail=head;
        }
        size+=1;
    }

    public void insertAtLast(int val){
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    public void insert(int value ,int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        if(index==size){
            insertAtLast(value);
            return;
        }

        Node temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Size : "+size);
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(tail==null) {
            head = null;
        }
        size=size-1;
        return val;
    }
    public int deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=null;
        tail=temp;
        size=size-1;
        return val;
    }
    public int deleteAtPosition(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node temp=getNode(index-1);
        int val=temp.next.value;
        temp.next=temp.next.next;
        return val;
    }

    private Node getNode(int i) {
        Node temp=head;
        for(int j=0;j<i;j++){
            temp=temp.next;
        }
        return temp;
    }

    //Problems

    //LeetCode-> Remove duplicates from a sorted list

    public void removeDuplicates(){
        Node node=head;
        while (node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        node.next=null;
    }

    //LeetCode -->  LinkedList cycle check,length,position

    public boolean hasCycle(Node node){
        Node slow=node;
        Node fast=node;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public Node detectCycle(Node node){
        Node fast=node;
        Node slow=node;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }

        if(fast!=null && fast.next!=null){
            return null;
        }

        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;

    }

    public int position(Node node){
        Node fast=node;
        Node slow=node;
        int length=0;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                Node temp=slow;
                do {
                    temp=temp.next;
                    length+=1;
                }while (temp!=slow);
                return length;
            }

        }
        return 0;
    }


    //LeetCode
    class ListNode{
        //just for sample;
        int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) {
          this.val = val;
      }
    ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
    }

    //Middle
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    //Reverse
    private ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode Next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = Next;
            if (Next != null) {
                Next = Next.next;
            }
        }

        return prev;
    }
}
