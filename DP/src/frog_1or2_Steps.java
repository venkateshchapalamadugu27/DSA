/*
Problem statement :-

There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.

For Example ->
If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 100000.
1 <= HEIGHTS[i] <= 1000 .

Time limit: 1 sec

Sample Input 1:
2
4
10 20 30 10
3
10 50 10
Sample Output 1:
20
0
Explanation of sample input 1:
For the first test case,
The frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost).
Then a jump from the 2nd stair to the last stair (|10-20| = 10 energy lost).
So, the total energy lost is 20 which is the minimum.
Hence, the answer is 20.

For the second test case:
The frog can jump from 1st stair to 3rd stair (|10-10| = 0 energy lost).
So, the total energy lost is 0 which is the minimum.
Hence, the answer is 0.

Sample Input 2:
2
8
7 4 4 2 6 6 3 4
6
4 8 3 10 4 4
Sample Output 2:
7
2


Hints:
1. Think about all the possibilities at each stair.
2. Using recursion, try to divide the problem into subproblems and calculate the answer for each subproblem only once - store it for reusing in the future.
3. The above can also be done iteratively.
 */

import java.util.Scanner;

public class frog_1or2_Steps {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of test cases : ");
        int cases=s.nextInt();
        for(int i=0;i<cases;i++){
            System.out.println("Enter the size of staircase : ");
            int n=s.nextInt();
            int[] height=new int[n];
            System.out.println("Enter the heights of staircase : ");
            for(int j=0;j<n;j++){
                height[j]=s.nextInt();
            }
            System.out.println("mininum steps with minimum energy loss :=> "+frogJump(n,height));
        }
    }
    public static int frogJump(int n, int height[]) {

        //  int[] dp=new int[n+1];
        //  Arrays.fill(dp,-1);
        //  return recur(n-1,heights,dp);
        // Write your code here..

        // only dp

        int[] dp=new int[n];
        dp[0]=0;

        for(int i=1;i<n;i++){

            int fs=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1) ss=dp[i-2]+Math.abs(height[i]-height[i-2]);

            dp[i]=Math.min(fs,ss);
        }

        return dp[n-1];
    }

    public static int recur(int index, int heights[],int[] dp){

        // recursion + dp

        if(index==0) return 0;

        if(dp[index]!=-1) return dp[index];

        int left= recur(index-1,heights,dp)+Math.abs(dp[index]-dp[index-1]);
        int right=Integer.MAX_VALUE;
        if(index>1) right= recur(index-2,heights,dp)+Math.abs(dp[index]-dp[index-2]);

        return dp[index]=Math.min(right,left);
    }

}
