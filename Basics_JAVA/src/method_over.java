import java.util.Scanner;

public class method_over {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int res=sum(2,3,6);
        System.out.println(res);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
