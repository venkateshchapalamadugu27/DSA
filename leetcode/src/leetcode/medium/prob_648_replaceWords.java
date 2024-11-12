package leetcode.medium;
import java.util.*;
public class prob_648_replaceWords {
    public static void main(String[] args) {
        List<String> dictionary=new ArrayList<>(List.of(new String[]{"cat" , "bat" , "rat"}));
        String sentence="the cattle was rattled by the battery";
        String result=replaceWords(dictionary,sentence);
        System.out.println(result);
    }
        public static String replaceWords(List<String> dictionary, String sentence) {
            String[] arr=sentence.split("\\s+");
            // System.out.println(Arrays.toString(arr));
            for(String word:dictionary){
                for(int i=0;i<arr.length;i++){
                    String sentenceWord=arr[i];
                    if(sentenceWord.length()>=word.length() &&
                            sentenceWord.substring(0,word.length()).equals(word)){
                        arr[i]=word;
                    }
                }
            }
            // System.out.println(Arrays.toString(arr));
            return String.join(" ", arr);
        }

}
