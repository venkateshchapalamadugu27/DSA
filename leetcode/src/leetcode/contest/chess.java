package leetcode.contest;

import java.util.Arrays;

public class chess {

    public static void main(String[] args) {
        String s1="a1",s2="c5";

        System.out.println(checkTwoChessboards(s1,s2));
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        int[][] chess={
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0}
        };

        int[] c1=new int[]{coordinate1.charAt(0)-'a',Integer.parseInt(String.valueOf(coordinate1.charAt(1)))-1};
        int[] c2=new int[]{coordinate2.charAt(0)-'a',Integer.parseInt(String.valueOf(coordinate2.charAt(1)))-1};

        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        return chess[c1[0]][c1[1]]==chess[c2[0]][c2[1]];

//        StringBuilder sb=new StringBuilder();
        
    }
}
