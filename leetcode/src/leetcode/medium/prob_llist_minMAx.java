package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob_llist_minMAx {
    public static void main(String[] args) {
        int[] arr={3,1};
        List<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(locMaxMin(list)));
    }
    private static int[] locMaxMin(List<Integer> list){
        List<Integer> locminmax=new ArrayList<>();
        int s=1,e=list.size()-1;
        for(int i=s;i<e;i++){
            if((list.get(i-1)>list.get(i)&&list.get(i)<list.get(i+1))||(list.get(i-1)<list.get(i)&&list.get(i)>list.get(i+1))){
                locminmax.add(i+1);
            }
        }
        int[] arr={-1,-1};
        if(locminmax.size()<2){
            return arr;
        }
        arr[1]=locminmax.get(locminmax.size()-1)-locminmax.get(0);
        arr[0]=findMin(locminmax);
        return arr;
    }
    private static int findMin(List<Integer> locminmax){
        int min=Integer.MAX_VALUE;
        for(int i=1;i<locminmax.size();i++){
            min=Math.min(min,locminmax.get(i)-locminmax.get(i-1));
        }
        return min;
    }
}
