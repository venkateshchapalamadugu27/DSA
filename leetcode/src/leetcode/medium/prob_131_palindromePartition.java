package leetcode.medium;
import java.util.*;
public class prob_131_palindromePartition {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> outer=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            List<String> inner=new ArrayList<>();
            int x=i+1;
            for(int j=0;j<s.length()-1;j++){
                if(isPalindrome(s.substring(j,j+x))){
                    inner.add(s.substring(j,j+x));
                }
            }
            outer.add(inner);
        }

        return outer;
    }

    private static boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }
}
