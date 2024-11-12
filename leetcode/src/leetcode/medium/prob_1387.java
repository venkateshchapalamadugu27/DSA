package leetcode.medium;

import java.util.Arrays;

public class prob_1387 {
    public static void main(String[] args) {
       String s = "leetcode";
       String t = "practice";
       StringBuilder sb=new StringBuilder();
       sb.append(s);
       
       int res= minSteps(s,t);
        System.out.println(res);
    }
    public static int minSteps(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for (char ch : s.toCharArray()) {
            sFreq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            tFreq[ch - 'a']++;
        }

        int steps = 0;
        for (int i = 0; i < 26; i++) {
            steps += Math.abs(sFreq[i] - tFreq[i]);
        }
        System.out.println(Arrays.toString(sFreq));
        System.out.println(Arrays.toString(tFreq));
        return steps / 2;
    }
}
