import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
