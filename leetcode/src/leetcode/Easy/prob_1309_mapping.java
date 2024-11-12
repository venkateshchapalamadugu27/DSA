package leetcode;
import java.util.*;
public class prob_1309_mapping {
    public static void main(String[] args) {
        String s = "10#11#12";

        System.out.println(freqAlphabets(s));
    }
        public static String freqAlphabets(String s) {
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            String r=sb.toString();
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<r.length();i++){
                if(String.valueOf(r.charAt(i))=="#"){
                    list.add(r.substring(i,i+1));
                    i+=1;
                }else{
                    list.add(String.valueOf(r.charAt(i)));
                }
            }

            System.out.println(list);
            return r;
        }

}
