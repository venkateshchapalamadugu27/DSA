import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arcrac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("array size : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
