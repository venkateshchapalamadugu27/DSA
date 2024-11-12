import java.util.Arrays;
public class selection {
    public static void main(String[] args) {
        int[] arr={4,2,7,3,2,22,11,56};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        Selection(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
