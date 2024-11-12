import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }
    static int lcm(int a,int b){

        return a*b/gcd(a,b);
    }
}