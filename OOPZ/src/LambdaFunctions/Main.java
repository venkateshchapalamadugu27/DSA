package LambdaFunctions;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            arr.add(i);
        }
//        arr.forEach(num -> System.out.print(num*2+" "));

//        Consumer<Integer> fun=num -> System.out.print(num*2+" ");
//        arr.forEach(fun);

        Function sum=(a,b)->a+b;
        Function dif=(a,b)->a-b;
        Function prod=(a,b)->a*b;
        Function div=(a,b)->a/b;

        Main myCaculator=new  Main();
        System.out.println(myCaculator.operate(5,2,sum));
        System.out.println(myCaculator.operate(5,2,dif));
        System.out.println(myCaculator.operate(5,2,prod));
        System.out.println((float)(myCaculator.operate(5,2,div)));

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.indexOf(4));
    }
    private static int operate(int a, int b, Function op){
        return op.operation(a,b);
    }
    interface Function{
        int operation(int a,int b);
    }
}
