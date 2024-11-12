package Generic;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private  int size=0;
    private int DEFAULT_SIZE=10;
    private Object[] data;
    public CustomGenArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(Object num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[DEFAULT_SIZE*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed= (T) data[size--];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
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
//        CustomGenArrayList<Integer> list=new CustomGenArrayList<>();
//        list.add(1);
//        list.add(7);
//        list.add(18);
//        list.add(45);
//        System.out.println(list.toString());

        CustomGenArrayList<Character> list=new CustomGenArrayList<>();
        list.add('1');
        list.add('7');
        list.add("18");
        list.add("45");
        System.out.println(list.toString());

    }
}
