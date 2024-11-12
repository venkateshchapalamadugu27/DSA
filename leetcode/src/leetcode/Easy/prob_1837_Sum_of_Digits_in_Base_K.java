package leetcode.Easy;
import java.util.*;
public class prob_1837_Sum_of_Digits_in_Base_K {
    public static void main(String[] args) {
       int n= 34, k = 6;
       System.out.println("Into base k   => "+sumBase(n,k));
       System.out.println("Sum in base k => "+sumbase(n,k));
    }
    public static int sumBase(int num, int k) {
        StringBuilder sb=new StringBuilder();
        while(num>0){
            int digit = num % k;
            sb.append(digit);
            num /= k;
        }
        int result=0;
        String s=sb.toString();
        for(int i=0;i<s.length();i++){
            int p= (int) Math.pow(k,i);
            result = result + (Integer.parseInt(String.valueOf(s.charAt(i))) * p);
        }
        return result;
    }
    public static int sumbase(int num, int k) {
        int result=0;
        while(num>0){
            int digit = num % k;
            result+=digit;
            num /= k;
        }
        return result;
    }
}
