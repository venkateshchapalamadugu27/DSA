import java.util.*;
public class Main {
    public static void main(String[] args) {

        String s="(u(love)i)";
//        int start=0,end=s.length()-1;
//        StringBuilder sb=new StringBuilder(s);
//        System.out.println(sb);
//        while(start<=end){
//            if(sb.charAt(start)=='(' && sb.charAt(end)==')'){
//                StringBuilder t= new StringBuilder(sb.substring(start , end));
//                t.reverse();
//                sb.replace(start,end,t.toString());
//                start++;end--;
//            }
//            else if(sb.charAt(start)==('(') && sb.charAt(end)!=')'){
//                end--;
//            }
//            else if(sb.charAt(start)!='(' && sb.charAt(end)==(')')){
//                start++;
//            }
//            else if(sb.charAt(start)!='(' && sb.charAt(end)!=')'){
//                start++;end--;
//            }
//        }
//        String res="";
//        for(char c:sb.toString().toCharArray()){
//            if(c!='(' && c!=')'){
//                res+=c;
//            }
//        }
//        System.out.println(res);
        System.out.println(reverseParentheses(s));
    }

    public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                int start = stack.pop();
                reverse(sb, start + 1, i - 1);
            }
        }

        // Remove all parentheses from the string
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '(' && sb.charAt(i) != ')') {
                res.append(sb.charAt(i));
            }
        }

        return res.toString();
    }

    private static void reverse(StringBuilder sb , int start , int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}