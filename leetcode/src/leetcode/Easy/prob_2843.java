package leetcode;
import java.util.*;
public class prob_2843 {
    public static void main(String[] args) {
        int low=1;
        int high=100;
        int result=countSymmetricIntegers(low,high);
        System.out.println(result);
    }
    public static int countSymmetricIntegers(int low, int high) {
        int res=find(low,high);
        return res;
    }
    private static int find(int low,int high){
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i) && i>10){
                count++;
            }
        }
        return count;
    }
    public static boolean isSymmetric(int n) {
        String num = Integer.toString(n);
        StringBuilder sb1 = new StringBuilder(num);
        StringBuilder sb2 = new StringBuilder(num).reverse();
        boolean b = sb1.toString().equals(sb2.toString());
        return b;
    }

}
