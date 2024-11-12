package leetcode;
import java.util.*;
public class Prob_1207_UniqueNoOfNumbers {
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        boolean ans=uniqueOccurrences(arr);
        System.out.println(ans);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                list.add(count);
                count=1;
            }
            else{
                count++;
            }
        }
        if(arr[arr.length-2]!= arr[arr.length-1]){
            list.add(1);
        }
        Collections.sort(list);
        System.out.println(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
