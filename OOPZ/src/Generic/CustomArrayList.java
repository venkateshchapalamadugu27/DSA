package Generic;

import java.util.Arrays;

public class CustomArrayList {

    private  int size=0;
    private int DEFAULT_SIZE=10;
    private int[] data;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[DEFAULT_SIZE*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
      int removed= data[size--];
      return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    private boolean isFull() {
        return size== data.length;
    }
    @Override
    public String toString(){
        System.out.println("Custom Array = "+ Arrays.toString(data) +", size = "+size);
        return "";
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size);
        System.out.println(list.toString());
        System.out.println(list.remove());
        System.out.println(list.toString());
    }
}
