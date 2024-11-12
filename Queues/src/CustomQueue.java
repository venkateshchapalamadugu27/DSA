import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    int end=0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int end) {
        this.data=new int[end];
    }

    public boolean isFull(){
        return end== data.length;
    }
    private boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int num) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end]= num;
        end++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int remove=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
