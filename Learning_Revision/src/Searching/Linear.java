package Searching;
import java.util.*;
public class Linear {
    public static void main(String[] args) {
        int[] arr={2,5,2,8,5,4,23,56,74,11,29};
        int target=239;
        String s=LinearSearch(arr,target);
        System.out.println(s);
    }
    static String LinearSearch(int[] arr,int target){
        for(int num:arr){
            if(num==target){
                return "Found";
            }
        }
        return "Not Found";
    }
}
