import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        int chocolates=200;
        Scanner s=new Scanner(System.in);
        int student=s.nextInt();
        System.out.println("Remaining Chocolates = "+chocolates%student);
        System.out.println("Distributed Chocolates = "+chocolates/student);
    }
}
