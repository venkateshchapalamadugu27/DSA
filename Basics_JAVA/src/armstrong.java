import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<1000;i++){
            if(fun(i)){
                System.out.print(i+" ");
            }

        }

    }
    static boolean fun(int a){
        int res=0;
        int orig=a;
        while(a>0) {
                int rem = a % 10;
                res = res + (rem * rem * rem);
                a = a / 10;
            }
            if(res==orig){
                return true;
            }
            return false;
    }
}
