package leetcode;
import java.util.*;
public class prob_1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        char[] arr=new char[sentence.length()];
        for(int i=0;i<sentence.length();i++){
            arr[i]=sentence.charAt(i);
        }
        List<Character> list=new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        System.out.println(list);
        return list.size()==26;
    }
}
