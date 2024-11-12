import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Nth fibonacci number is :- "+fibo(n));
    }
    private static int fibo(int n){
        if(n<=1){
            return n;
        }
       return fibo(n-1)+fibo(n-2);

    }}