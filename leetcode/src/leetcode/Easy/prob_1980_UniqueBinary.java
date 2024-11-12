package leetcode;
import java.sql.SQLOutput;
import java.util.*;
public class prob_1980_UniqueBinary {
    public static void main(String[] args) {
        String[] arr={"0"};
        System.out.println(findDifferentBinaryString(arr));
    }
    public static String findDifferentBinaryString(String[] nums) {
        List<Integer> list=new ArrayList<>();
        for(String s:nums){
            list.add(Integer.parseInt(s,2));
        }
        Collections.sort(list);
        System.out.println(list);
        int i=0;
        int width=nums[0].length();
        for(i=0;i<list.size();i++){
            if(list.get(i)!=i){
                return String.format("%" + width + "s", Integer.toBinaryString(i)).replace(' ', '0');
            }
        }

        return String.format("%" + width + "s", Integer.toBinaryString(i+1)).replace(' ', '0');
    }
}
