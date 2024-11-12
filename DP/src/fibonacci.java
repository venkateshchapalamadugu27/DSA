import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(n+"th fibonacci number is :=>  "+fibo(n,dp));
        System.out.println(Arrays.toString(dp));
    }
    private static int fibo(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
            
        }
//        int fibn=fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
}
