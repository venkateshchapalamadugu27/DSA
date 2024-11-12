package Permutations;

import java.util.ArrayList;
import java.util.Arrays;

public class Sub_abc {
    public static void main(String[] args) {
//        permutation("abc","");
//         int count= permutationCount("abc","");
//         System.out.println(count);
       ArrayList<String> answer=permutationList("abc","");
      System.out.println(answer);
    }
    static void permutation(String given,String ans){
        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=given.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            permutation(given.substring(1),f+ch+s);
        }

    }
    static int permutationCount(String given,String ans){
        if(given.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=given.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            count=count+permutationCount(given.substring(1),f+ch+s);
        }
       return count;
    }

    static ArrayList<String> permutationList(String given,String ans){
        if(given.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=given.charAt(0);
        ArrayList<String> answer=new ArrayList<>();
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
           answer.addAll(permutationList(given.substring(1),f+ch+s));
        }
        return answer;
    }
}
