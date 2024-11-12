package leetcode;
import java.util.*;
public class prob_202_HappyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        List<Integer> list=new ArrayList<>();
        boolean result=check(n,list);
        return result;
    }
    private static boolean check(int n,List<Integer> list){
        if(n==1){
            return true;
        }
        int num=0;
        while(n>0){
            int rem=n%10;
            num+=(rem*rem);
            n/=10;
        }
        if(list.contains(n)){
            return false;
        }
        list.add(num);
        return check(num,list);
    }
}
