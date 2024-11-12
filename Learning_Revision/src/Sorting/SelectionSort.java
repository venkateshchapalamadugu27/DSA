package Sorting;
import java.util.*;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l=s.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < l; i++) {
            arr[i]=s.nextInt();
        }
        selection(arr);


        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int first=0;
            int last= arr.length-1-i;
            int max=getMaxIndex(arr,first,last);
            swap(arr,max,last);
        }
    }

    private static int getMaxIndex(int[] arr , int start , int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    private static void swap(int[] arr , int max , int last) {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
