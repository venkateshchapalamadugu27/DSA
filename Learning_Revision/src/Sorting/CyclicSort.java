package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l=s.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < l; i++) {
            arr[i]=s.nextInt();
        }
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

    }
}
