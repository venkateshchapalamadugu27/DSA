package leetcode.medium;

public class prob_2380 {
    public static void main(String[] args) {
         String s = "0110101";

        System.out.println(secondsToRemoveOccurrences(s,0));
    }
    public static int secondsToRemoveOccurrences(String s,int res) {
        if (!s.contains("01")) return res;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0' && arr[i + 1] == '1') {
                arr[i] = '1';
                arr[i + 1] = '0';
                i++;
            }
        }

        res++;
        String str = new String(arr);

        return secondsToRemoveOccurrences(str, res);
    }

}
