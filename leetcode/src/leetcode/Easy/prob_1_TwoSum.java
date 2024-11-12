package leetcode;
import java.util.*;

public class prob_1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]== target){
                list.add(i); list.add(i+1); break;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append("venkatesh");
        sb.reverse();
        int[] res=new int[2];
        res[0]=list.get(0);
        res[1]=list.get(1);
        return res;
    }
}
