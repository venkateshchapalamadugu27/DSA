package leetcode.medium;
import java.util.*;
public class Prob_658_KClosest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=4,x=-1;
        List<Integer> list=findClosestElements(arr,k,x);
        System.out.println(list);
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
