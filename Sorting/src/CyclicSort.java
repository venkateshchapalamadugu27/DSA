import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={7,2,3,1,6,5,4};
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] sort(int[] arr){
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
        return arr;
    }
}
