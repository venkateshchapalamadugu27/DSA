import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse1(arr);
    }
    static void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }

    public static void reverse1(int[] arr){
        for(int i=0;i<(arr.length+1)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
