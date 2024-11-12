package leetcode.Easy;//package leetcode;
import  java.util.*;
public class ColorCount {
    public static void main(String[] args) {
        String[] balls = {"red", "blue", "green", "red", "blue", "blue", "red", "green","green","pink"};
        Map<String, Integer> colorCount = new HashMap<>();

        for (String s : balls) {
            colorCount.put(s, colorCount.getOrDefault(s, 0) + 1);
        }

        colorCount.forEach((color, count) -> System.out.println(color + " count : " + count));
   }
}
