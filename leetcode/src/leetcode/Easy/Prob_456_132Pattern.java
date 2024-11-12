package leetcode;

public class Prob_456_132Pattern {
    public static void main(String[] args) {
        int[] nums={3,5,0,3,4};
        System.out.print(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=i+2;
            if((nums[i]<nums[k]) || (nums[k]<nums[j])){
                return true;
            }
        }
        return false;
    }
}
