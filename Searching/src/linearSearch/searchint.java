package linearSearch;

public class searchint {
    public static void main(String[] args) {
     int target=10;
     int[] arr={12,34,32,10,89};
     System.out.println(linear(arr,target));
    }
    static boolean linear(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i:arr){
            if(target==i){
                return true;
            }
        }
        return false;
    }
}
