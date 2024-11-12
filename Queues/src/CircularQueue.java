public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    int end=0;
    int front=0;
    int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int end) {
        this.data=new int[end];
    }

    public boolean isFull(){
        return size== data.length;
    }
    private boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int num){
        if(isFull()){
             return false;
        }
        data[end++]=num;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty");
        }
        int remove=data[front++];
        size--;
        front=front% data.length;
        return remove;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return ;
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i=i% data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
