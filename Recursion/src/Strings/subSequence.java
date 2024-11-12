package Strings;
import java.util.*;
public class subSequence {
    public static void main(String[] args) {
        seq("abc","");
        System.out.println(seqR("abc",""));

    }
    public static void seq(String given,String res){
        if(given.isEmpty()){
            System.out.print(res+" ");
            return;
        }
        char ch=given.charAt(0);
        seq(given.substring(1),res+ch);
        seq(given.substring(1),res);
    }
    public static ArrayList<String> seqR(String given,String res){
        if(given.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(res);
            return list;
        }
        char ch=given.charAt(0);
        ArrayList<String> left=seqR(given.substring(1),res+ch);
        ArrayList<String> right=seqR(given.substring(1),res);

        left.addAll(right);
        return left;
    }
}
