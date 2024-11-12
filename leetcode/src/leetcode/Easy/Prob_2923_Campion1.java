package leetcode;
import  java.util.*;
public class Prob_2923_Campion1 {

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,1},{0,0,0},{0,1,0}
        };
        System.out.println(findChampion(grid));
    }
    public static int findChampion(int[][] grid) {
            List<Integer> list=new ArrayList<>();
            int sum=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    sum+=grid[i][j];
                }
                list.add(sum);
                sum=0;
            }
            int max=0;
        System.out.println(list);
            for(int i=0;i<list.size();i++){
                if(list.get(i)<list.get(i+1)){
                    max=i+1;
                }
            }
            return max;
        }

}
