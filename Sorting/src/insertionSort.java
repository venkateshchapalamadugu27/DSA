import java.util.*;
import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
        int[] arr={4,1,4,2,8,5,8};
        insertion(arr);
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
