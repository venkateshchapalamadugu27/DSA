package leetcode;
import java.util.*;

public class prob_1002_findCommon {
    public static void main(String[] args) {
        String words = Arrays.toString(new String[]{"bella" , "label" , "roller"});
        System.out.println(commonChars(new String[]{words}));
    }
    public static List<String> commonChars(String[] words) {
        List<String> result=new ArrayList<>();
        for(char ch='a';ch<='z';ch++){
            int min=Integer.MAX_VALUE;
            for(String word:words){
                int count=0;
                for(char c:word.toCharArray()){
                    if(c==ch) count++;
                }
                min=Math.min(count,min);
            }
            for(int i=0;i<min;i++){
                result.add(String.valueOf(ch));
            }
        }
        return result;
    }
}
