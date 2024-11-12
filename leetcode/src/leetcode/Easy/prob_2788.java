package leetcode;
import java.util.*;
public class prob_2788 {
    public static void main(String[] args) {
        List<String> words = List.of(new String[]{"$easy$","$problem$"});
        char separator = '$';
        System.out.println(splitWordsBySeparator(words,separator));
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        for(int j=0;j<words.size();j++){
            String word=words.get(j);
            String str="";
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==separator){
                    if(str!=""){
                        res.add(str);
                    }
                    str="";
                }

                if(word.charAt(i)!=separator){
                    str+=word.charAt(i);
                }
                if(i+1==word.length()){
                    if(str!=""){
                        res.add(str);
                    }
                    str="";
                }
            }

        }
        return res;
    }
}
