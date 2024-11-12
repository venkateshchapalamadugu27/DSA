package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class prob_1807 {

    public static void main(String[] args) {
        String s="(a)(a)(a)aaa";
        List<List<String>> knowledge = List.of(
                List.of("a", "yes")
//                List.of("age", "two")
        );
        String result=evaluate(s,knowledge);
        System.out.println(result);
    }
    public static String evaluate(String s, List<List<String>> knowledge) {
        String reformed="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') reformed+=" "+String.valueOf(s.charAt(i));
            else if(s.charAt(i)==')') reformed+=String.valueOf(s.charAt(i))+" ";
            else reformed+=String.valueOf(s.charAt(i));
        }

        String[] arr=reformed.split("\\s+");
        String[] newarr=new String[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("(")){
                String word=arr[i];
                String retword=foundInKnowledge(word,knowledge);
//                System.out.println(retword);
                newarr[i]=retword;
            }
            else{
                newarr[i]=arr[i];
            }
        }

//        System.out.println(Arrays.toString(newarr));
        String joined=String.join(" ",newarr);
        String result="";
        for(int i=0;i<joined.length();i++){
            char c=joined.charAt(i);
            if(c!='(' && c!=')' && c!=' '){
                result+=String.valueOf(joined.charAt(i));
            }
        }
//        System.out.println(result);
        return result;
    }

    private static String foundInKnowledge(String word,List<List<String>> knowledge){
//        System.out.println(word);
        String newword="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c!='(' && c!=')' && c!=' '){
                newword+=String.valueOf(word.charAt(i));
            }
        }
        for(List<String> list:knowledge){
            String word1=list.get(0),word2=list.get(1);
//            System.out.println(word1+" "+word2);
            if(newword.equals(word1)){
                return word2;
            }
        }
        return "?";
    }
}
