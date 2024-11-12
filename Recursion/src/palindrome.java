import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int digits=(int)(Math.log10(num))+1;
        int rev=revNum(num,digits);
        if(num==rev){
            System.out.print("PALINDROME");
        }
        else{
            System.out.print("NOT A PALINDROME");
        }
    }

    private static int revNum(int num,int digits) {
        if(num%10==num){
            return num;
        }
        int rem=num%10 ;
        return  rem* (int)Math.pow(10,digits-1) + revNum(num/10,digits-1);

    }
}
