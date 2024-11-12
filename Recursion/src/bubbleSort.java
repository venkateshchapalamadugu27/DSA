import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={12,3,2,6,4,5,9};
        bubble(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int r, int c) {
        if(r==0){
           return;
        }
        if(c<r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }
}
