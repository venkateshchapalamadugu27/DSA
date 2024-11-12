public class maxNum {
    public static void main(String[] args) {
        int[] arr={1,3,1,89,34,2,8};
        System.out.println(max(arr));
        int x=1;
        for(int i=0;i<10;i++){
            x *= 2;
            System.out.println();
        }
    }
    static int max(int[] num){
        int maximum=num[0];
        for(int i:num){
            if(maximum<i){
                maximum=i;
            }
        }
        return maximum;
    }
}

