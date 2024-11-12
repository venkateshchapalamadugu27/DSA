package leetcode;
import java.util.*;
public class prob_67_addBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("10","11"));
    }
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}
