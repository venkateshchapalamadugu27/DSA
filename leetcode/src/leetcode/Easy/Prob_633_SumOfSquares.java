package leetcode;
import java.util.*;
public class Prob_633_SumOfSquares {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
    public static  boolean judgeSquareSum(int c) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=c;i++){
            if((i*i)<=c){
                list.add(i*i);
            }
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==c){
                    return true;
                }
            }
        }
        return false;
    }
}
