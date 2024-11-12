import java.util.Scanner;
import java.util.*;
public class ExamHashedIn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=20;
        String res=pattern(n);
        System.out.println(res.toString());
    }

    private static String pattern(int n) {
        String result="";
        int repeat=reputation(n);
        int rane= n/repeat;
        String demo="abcdefghijklmnopqrstuvwxyz";
        while (repeat>=0){
            result=result+demo.substring(0,rane);
            repeat--;
        }



        return result;
    }
    private static int reputation(int n){
        int count=1;
        if(n<27){
            return 1;
        }
        while (n/count > 27){
            count++;
        }
        return count;
    }
}
