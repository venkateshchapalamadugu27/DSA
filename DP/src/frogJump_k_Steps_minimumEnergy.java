/*
Problem Statement
There are
N stones, numbered
1,2,…,N. For each
i (
1≤i≤N), the height of Stone
i is
h
i
​
 .

There is a frog who is initially on Stone
1. He will repeat the following action some number of times to reach Stone
N:

If the frog is currently on Stone
i, jump to one of the following: Stone
i+1,i+2,…,i+K. Here, a cost of
∣h
i
​
 −h
j
​
 ∣ is incurred, where
j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone
N.

Output===>
Print the minimum possible total cost incurred.

Sample Input 1 =>
5 3
10 30 40 50 20
Sample Output 1
30

Sample Input 2 =>
3 1
10 20 10
Sample Output 2
20

Sample Input 3 =>
2 100
10 10
Sample Output 3
0

Sample Input 4=>
10 4
40 10 20 70 80 10 20 70 80 60
Sample Output 4
40
 */

import java.util.*;
public class frogJump_k_Steps_minimumEnergy {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=s.nextInt();
        }
        System.out.println(frogJump(n,heights,k));
    }

    public static int frogJump(int n,int[] heights,int k){
             int dp[]=new int[n];
             dp[0]=0;
             for(int i=1;i<n;i++){
                 int minSteps=Integer.MAX_VALUE;
                 for(int j=1;j<=k;j++){
                    if(i-j>=0) {
                        int jump=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                        minSteps=Math.min(minSteps,jump);
                    }
//                     dp[i]=minSteps;
                 }
                 dp[i]=minSteps;
             }
             return dp[n-1];
    }

}
