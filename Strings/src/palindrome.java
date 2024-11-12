import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        reverse(str);
    }
    static void reverse(String str){
        StringBuilder rev=new StringBuilder();
        int x=str.length()-1;
        while(x>=0){
            rev.append(str.charAt(x));
            x--;
        }
        System.out.print(rev);
    }
    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
