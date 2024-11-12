package Collections;

import java.util.Scanner;

public class OneExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int testCases=s.nextInt();
        for(int i=0;i<testCases;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            System.out.println("product = "+x*y);
        }
    }
}
