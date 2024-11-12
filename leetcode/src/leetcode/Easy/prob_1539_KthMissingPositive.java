package leetcode;
import java.util.*;
public class prob_1539_KthMissingPositive {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int n=findKthPositive(arr,5);
        System.out.println(n);
    }
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList();
        for(int i=1;i<arr.length+k;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    break;
                }
                list.add(i);
                break;
            }

        }
        System.out.println(list);
        return list.get(k);
    }
}
