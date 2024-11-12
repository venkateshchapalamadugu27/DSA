import java.util.Arrays;
import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        /* for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
