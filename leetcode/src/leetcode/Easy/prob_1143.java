package leetcode;

public class prob_1143 {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abc", "abdec"));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int count=0;
        if(n>=m){
            for(int i=0;i<m;i++){
                char ch=text2.charAt(i);
                for(int j=0;j<n;j++){
                    if(ch==text1.charAt(j)){
                        count++;
                    }
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                char ch=text1.charAt(i);
                for(int j=0;j<m;j++){
                    if(ch==text2.charAt(j)){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
