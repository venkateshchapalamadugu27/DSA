package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l=s.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < l; i++) {
            arr[i]=s.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
