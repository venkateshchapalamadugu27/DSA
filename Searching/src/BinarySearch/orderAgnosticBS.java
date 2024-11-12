package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-2,0,2,3,10,44,49,54,56};
        int[] arr2={56,54,49,44,10,3,2,0,-2};
        int target=-2;
        int res=binarySearch(arr2,target);
        System.out.println(res);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean AG=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(AG){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
