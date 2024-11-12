import java.util.*;
public class sortedArrayCheck {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,8};
        System.out.println(check(arr,0));

//          int[] arr={1,6,3,7,4,3,6,4};
//
//          List<Integer> list=new ArrayList<>();
//          for(int num:arr){
//              if(list.contains(num)){
//                  list.remove((Integer) num);
//              }
//              else{
//                  list.add(num);
//              }
//          }
//
//        System.out.println(list);

    }
    static boolean check(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }
}
