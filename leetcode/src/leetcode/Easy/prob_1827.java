package leetcode;
import java.util.*;
public class prob_1827 {

    public static void main(String[] args) {
        int[] arr={1,5,2,4,1};
        int res=minOperations(arr);
        System.out.println(res);
    }
    public static int minOperations(int[] nums) {
        int count=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]-nums[i+1] >=0){
                count+=nums[i]-nums[i+1]+1;
                nums[i+1]+=(nums[i]-nums[i+1]+1);
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
