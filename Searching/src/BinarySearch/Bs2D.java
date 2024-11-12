package BinarySearch;
import java.util.Arrays;
public class Bs2D {
    public static void main(String[] args) {
          int target=27;
          int arr[][]={
                  {10,20,30,40},
                  {15,25,35,45},
                  {27,28,37,47}
          };
          System.out.println(Arrays.toString(binarySearch(arr,target)));
    }

    static int[] binarySearch(int arr[][],int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]<target){
                r++;
            } else if (arr[r][c]>target) {
                c--;
            }
            else{
                return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};


    }

}

