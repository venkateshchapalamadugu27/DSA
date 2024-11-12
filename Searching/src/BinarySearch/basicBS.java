package BinarySearch;

public class basicBS {
    public static void main(String[] args) {
       int[] arr={-12,-5,-2,-1,0,2,5,32,88,98,101};
       int target=10;
       int res=binarySearch(arr,target);
       if (res==-1){ System.out.println("Not found");}
       else System.out.println(res);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
