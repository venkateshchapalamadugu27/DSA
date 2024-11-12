package linearSearch;

public class minMax {
    public static void main(String[] args) {
        int[] arr={1,6,3,-2,0,-3,9};
        int min=min(arr);
        int max=max(arr);
        System.out.println("MINIMUM : "+min +" MAXIMUM : "+max);
    }
    static int min(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }

        }
        return max;
    }
}
