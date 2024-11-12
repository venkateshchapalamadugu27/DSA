package leetcode;
import java.util.*;
public class prob_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }
//    public static int[] searchRange(int[] arr, int target) {
//        int start=0;
//        int end=arr.length-1;
//        List<Integer> list=new ArrayList<>();
//
//        while(start<=end) {
//            if(arr[start]==target){
//                list.add(start);
//                start++;
//            }
//            if(arr[end]==target){
//                list.add(end);
//                end--;
//            }
//            if(list.size()==2){
//                break;
//            }
//
//        }
//        int[] res=new int[2];
//        int[] res1={-1,-1};
//        if(list.size()==0){
//            return res1;
//        }
//        Collections.sort(list);
//        if(list.size()==1){
//            res[0]=list.get(0);
//            res[1]=list.get(0);
//        }
//        else{
//            res[0]=list.get(0);
//            res[1]=list.get(list.size()-1);
//        }
//        return res;
//    }
    public static int[] searchRange(int[] nums , int target) {
        int[] res=new int[2];
        res[0]=search(nums,target,true);
        res[1]=search(nums,target,false);
        return res;
    }
    public static int search(int[] nums,int target,boolean findIndex){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                ans=mid;
                if(findIndex){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}
