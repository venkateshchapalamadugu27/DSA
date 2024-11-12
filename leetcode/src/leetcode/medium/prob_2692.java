package leetcode.medium;
import java.util.*;
public class prob_2692 {
        public static long countSubarrays(int[] nums, int k) {
            long count=0;
            Arrays.sort(nums);
            int max=nums[nums.length-1];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    count+=check(Arrays.copyOfRange(nums,i,j+1),max,k);
                }
            }
            return count;
        }
        private static int check(int[] arr,int max,int k){
            System.out.println(Arrays.toString(arr));
            int count=0;
            for(int num:arr){
                if(num==max){
                    count++;
                }
            }
            return count>=k ? 1 : 0 ;
        }

    public static void main(String[] args) {
        int[] nums={1,3,2,3,3};
        System.out.println(countSubarrays(nums , 2));
    }

}
