package linearSearch;

public class twoDarr {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        int target=0;
        boolean res=search(arr,target);
        System.out.println(res);
    }
    static boolean search(int[][] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int row=0;row<arr.length;row++){
            for(int j=0;j<arr[row].length;j++){
                if(target==arr[row][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
