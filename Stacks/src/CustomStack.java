import java.util.Arrays;

import static sun.util.locale.LocaleUtils.isEmpty;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    static int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int remove=data[ptr];
        return remove;
    }
    public boolean push(int num) {
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr]=num;
//        System.out.println(data[ptr]);
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int remove=data[ptr];
        ptr--;
        return remove;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public static boolean isEmpty(){
        return ptr==-1;
    }

    public void display(){
        if(ptr==-1){
            System.out.println("NOthing Found");
        }
        int[] res=new int[ptr+1];
        for(int i=0;i<=ptr;i++){
            res[i]=data[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
