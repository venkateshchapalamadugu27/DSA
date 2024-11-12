import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=0;i<=100;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean prime(int a){
      int count=0;
      if(a<2) return false;
      for(int i=2;i<a;i++){
              if(a%i==0){
                  return false;
              }
        }
      return true;
    }
}
