package leetcode.medium;

public class prob_2846 {
    public static void main(String[] args) {
        String s = "z";
        String t = "abcde";
        System.out.println(appendCharacters(s,t));
    }
    public static int appendCharacters(String s, String t) {
        int i=0,j=0;
        while (i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
    }
}
