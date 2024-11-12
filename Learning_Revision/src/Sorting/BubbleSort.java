package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l=s.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < l; i++) {
            arr[i]=s.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr){
        int l=arr.length;
        for (int i = 0; i < l; i++) {
            for(int j=0;j<l-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
