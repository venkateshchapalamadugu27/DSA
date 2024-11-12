package patterns;
import java.util.*;
public class patternWithoutRec {
    public static void main(String[] args) {
        //pattern3(5);
        //pattern4(5);
        pattern5(4);
    }
    static void pattern3(int n){
        for(int row=n;row>=1;row--){
            for(int col=0;col<row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1;row<=2*n;row++){
            int totalCols=row>n ? 2*n-row : row ;
            for(int col=1;col<=totalCols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
