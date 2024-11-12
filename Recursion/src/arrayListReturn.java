import java.util.*;
public class arrayListReturn {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,3,7,8};
        ArrayList<Integer> ans=findIndex(arr,3,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findIndexWA(arr,3,0));
    }

    private static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return findIndex(arr,target,index+1,list);
    }
   static ArrayList<Integer> list1=new ArrayList<Integer>();
    private static ArrayList<Integer> findIndexWA(int[] arr, int target, int index) {
        if(index==arr.length){
            return list1;
        }
        if(target==arr[index]){
            list1.add(index);
        }
        return findIndexWA(arr,target,index+1);
    }
}
