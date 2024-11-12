package leetcode;
public class Prob_520_DetectCapital {
    public static void main(String[] args) {
        String word="Leetcode";
        System.out.print(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        int countC=0;
        int countS=0;
        for(int i=0;i<word.length();i++){
            if((int)(word.charAt(i))>96){
                countS++;
            }
            else{
                countC++;
            }
        }
        int x=Math.abs(countS-countC);
        if(((int)(word.charAt(0))<96) && x==word.length()-2){
            return true;
        }
        return word.length() == countS || word.length() == countC;
    }
}
