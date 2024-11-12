package leetcode;
import java.util.*;
import java.lang.String;
public class prob_2589_SortVowels {
    public static void main(String[] args) {

        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                list.add(i);
                vowels.add(s.charAt(i));
            }
        }


        System.out.println(list);
        System.out.println(vowels);
        Collections.sort(vowels);
        System.out.println(vowels);
        String res="";
        int j=0;
        for(int i=0;i<s.length();i++){

            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                res+=vowels.get(j);
                j++;
            }
            else{
                res+=s.charAt(i);
            }

        }
        return res;
    }
}
