package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,2,8,5,4,23,56,74,11,29};
        int target=213;
        String s=binarySearch(arr,target);
        System.out.println(s);
    }
    private static String binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return "Found";
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
        }
        return "Not Found";
    }

}
